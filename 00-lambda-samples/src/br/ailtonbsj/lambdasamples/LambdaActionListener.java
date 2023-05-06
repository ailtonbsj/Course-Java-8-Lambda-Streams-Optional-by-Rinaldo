package br.ailtonbsj.lambdasamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LambdaActionListener {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.LINE_AXIS));
		
		JButton jButton = new JButton();
		jButton.setText("Click me!");
		
		JButton jButtonLambda = new JButton();
		jButtonLambda.setText("Click me Lambda!");
		
		// ActionListener without Lambda
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				System.out.println("Hello World!");
			}
		});
		
		// ActionListener with Lambda
		jButtonLambda.addActionListener(ev -> System.out.println("Hello World Lambda!"));
		
		jPanel.add(jButton);
		jPanel.add(jButtonLambda);
		jFrame.add(jPanel);
		jFrame.pack();
		jFrame.setVisible(true);
	}

}
