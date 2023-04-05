FROM eclipse-temurin:17-jdk-alpine
MAINTAINER amilton2012
COPY target/devops-0.0.1.jar devops.jar
ENTRYPOINT ["java","-jar","/devops.jar"]
