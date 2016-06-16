> Cup(C++ Unified Package) is a management tool with a focus on package dependency automation.

## Setuping

### Install JDK

1. Download JDK

```bash
http://www.oracle.com/technetwork/java/javase/downloads/index.html
```

2. Install JDK

```bash
$ sudo mkdir /usr/local/lib/jvm
$ sudo tar zxvf jdk-8u91-linux-x64.tar.gz -C /usr/local/lib/jvm
$ cd /usr/local/lib/jvm && sudo ln -s jdk1.8.0_91 default
```

3. Export `JAVA_HOME` and `PATH`

```bash
$ export JAVA_HOME='/usr/local/lib/java/default'
$ export PATH="$PATH:$JAVA_HOME/bin"
$ source ~/.bashrc
```

4. Verify

```bash
$ java -version
```

### Install Scala

1. Download Scala

```bash
http://www.scala-lang.org/download/
```

2. Install Scala

```bash
$ sudo mkdir /usr/local/lib/scala
$ sudo tar zxvf scala-2.11.8.tgz -C /usr/local/lib/scala
$ cd /usr/local/lib/scala && sudo ln -s scala-2.11.8 default
```

4. Export `SCALA_HOME` and `PATH`

```bash
$ vim ~/.bashrc
export SCALA_HOME='/usr/local/lib/scala/default'
export PATH="$PATH:$SCALA_HOME/bin"
```

4. Verify

```bash
$ source ~/.bashrc
$ scala -version
```

### Install Gradle

1. Download Gradle

```bash
https://gradle.org/gradle-download/
```

2. Install Gradle

```bash
$ sudo mkdir /usr/local/lib/gradle
$ sudo unzip gradle-2.14-bin.zip -d /usr/local/lib/gradle
$ cd /usr/local/lib/gradle && sudo ln -s gradle-2.14 default
```

3. Export `GRADLE_HOME` and `PATH`

```bash
$ vim ~/.bashrc
export GRADLE_HOME='/usr/local/lib/gradle/default'
export PATH="$PATH:$GRADLE_HOME/bin"
```

4. Verify

```bash
$ source ~/.bashrc
$ gradle -version
```

## Building

```bash
$ git clone git@github.com:ccup/cup.git
$ cd cup
$ gradle spec
```

## IDE

This will generate appropriate IDEA metadata so that the project can be opened from within IDEA. 

```bash
$ gradle idea
```



