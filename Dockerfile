FROM andreptb/maven:3.3.9-jdk8
EXPOSE 8080
RUN mkdir -p /myapp
WORKDIR /myapp
COPY . .
CMD mvn clean install -Phit-refresh