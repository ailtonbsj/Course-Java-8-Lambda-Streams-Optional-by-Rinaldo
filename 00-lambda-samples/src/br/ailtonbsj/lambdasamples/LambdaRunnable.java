package br.ailtonbsj.lambdasamples;

public class LambdaRunnable {

	public static void main(String[] args) {
		
		// new thread without Lambda
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world!");
			}
		}).run();
		
		// new thread with lambda
		new Thread(() -> System.out.println("Hello Lambda!")).run();
	}

}
