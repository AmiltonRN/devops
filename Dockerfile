FROM eclipse-temurin:17-jdk-alpine
MAINTAINER amiltonrn
COPY target/devops-0.0.1.jar devops.jar
ENTRYPOINT ["java","-jar","/devops.jar"]
