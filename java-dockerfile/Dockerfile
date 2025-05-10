FROM ubuntu
WORKDIR /java
RUN apt-get update && apt-get install curl -y
RUN curl https://download.java.net/java/GA/jdk24.0.1/24a58e0e276943138bf3e963e6291ac2/9/GPL/openjdk-24.0.1_linux-x64_bin.tar.gz -o openjdk.tar.gz
RUN tar -xzf openjdk.tar.gz
RUN rm openjdk.tar.gz
ENV PATH $PATH:/java/jdk-24.0.1/bin
ENV JAVA_HOME /java/jdk-24.0.1
RUN java -version
# This Dockerfile creates a simple image that installs Java 24.0.1 on an Ubuntu base image. 
# It sets the working directory to /java, updates the package list, installs curl,
# downloads the Java tarball, extracts it, removes the tarball, and sets the JAVA_HOME
# environment variable. Finally, it adds the Java binary directory to the PATH and
# verifies the installation by running java -version.
# The image can be built using the command:
# docker build -t java-image .
# The image can be run using the command:  
# docker run -it java-image


