FROM ubuntu:14.04
RUN echo "deb http://archive.ubuntu.com/ubuntu saucy main universe" > /etc/apt/sources.list
RUN apt-get -y update && apt-get -y upgrade
RUN apt-get -y install git

