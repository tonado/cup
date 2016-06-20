Cup(C++ Unified Package) is a management tool with a focus on package dependency automation.

## Setuping

### Install JDK

- Download JDK

```bash
http://www.oracle.com/technetwork/java/javase/downloads/index.html
```

- Install JDK

```bash
$ sudo mkdir -p /usr/local/lib/jvm
$ sudo tar zxvf jdk-8u91-linux-x64.tar.gz -C /usr/local/lib/jvm
$ cd /usr/local/lib/jvm && sudo ln -s jdk1.8.0_91 default
```

- Export `JAVA_HOME` and `PATH`

```bash
$ echo "export JAVA_HOME=/usr/local/lib/java/default" >> ~/.bashrc
$ echo "export PATH=$JAVA_HOME/bin:$PATH" >> ~/.bashrc
$ source ~/.bashrc
```

- Verify

```bash
$ java -version
```

### Install Scala

- Download Scala

```bash
http://www.scala-lang.org/download/
```

- Install Scala

```bash
$ sudo mkdir -p /usr/local/lib/scala
$ sudo tar zxvf scala-2.11.8.tgz -C /usr/local/lib/scala
$ cd /usr/local/lib/scala && sudo ln -s scala-2.11.8 default
```

- Export `SCALA_HOME` and `PATH`

```bash
$ echo "export SCALA_HOME=/usr/local/lib/scala/default" >> ~/.bashrc
$ echo "export PATH=$SCALA_HOME/bin:$PATH" >> ~/.bashrc
$ source ~/.bashrc
```

- Verify

```bash
$ scala -version
```

### Install Gradle

- Download Gradle

```bash
https://gradle.org/gradle-download/
```

- Install Gradle

```bash
$ sudo mkdir -p /usr/local/lib/gradle
$ sudo unzip gradle-2.14-bin.zip -d /usr/local/lib/gradle
$ cd /usr/local/lib/gradle && sudo ln -s gradle-2.14 default
```

- Export `GRADLE_HOME` and `PATH`

```bash
$ echo "export GRADLE_HOME=/usr/local/lib/gradle/default" >> ~/.bashrc
$ echo "export PATH=$GRADLE_HOME/bin:$PATH" >> ~/.bashrc
```

- Verify

```bash
$ gradle -version
```

## Building

```bash
$ git clone git@github.com:ccock/cup.git && cd cup
$ gradle spec
```

## IDE Support

This will generate appropriate IDEA metadata so that the project can be opened from within IDEA. 

```bash
$ gradle idea
```
