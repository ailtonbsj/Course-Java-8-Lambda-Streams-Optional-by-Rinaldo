# Course Lambda, Streams and Optional from Java 8
![](https://img.shields.io/badge/status-completed-brightgreen)

<p align="center">
<img src=".github/logo.png">
</p>

All subjects more interesting of Java 8: Lambda Functions, Streams, Optional, Functional programming, etc! From [Youtube](https://www.youtube.com/playlist?list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud).

Creator: RinaldoDev

## History of commands

```bash
# Install openJDK 17 globally
sudo apt install openjdk-17-jdk
sudo apt install openjdk-17-source

# Add JAVA_HOME
echo 'export JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64/"' | \
sudo tee /etc/profile.d/jdk.sh

# Download Eclipse Installer from
# https://www.eclipse.org/downloads/packages/installer
# Extract package
tar -zxf eclipse-inst-jre-linux64.tar.gz

# Eclipse IDE for Enterprise Java and Web Developers
# Installation Folder: ~/.apps

# Fix Launcher
sed -i "/Categories=/c\Categories=Development;IDE;" \
~/.local/share/applications/epp.package.jee.desktop
```