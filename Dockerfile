FROM openjdk:18-jdk-alpine
MAINTAINER kathiresan.in@gmail.com
COPY target/k8s-mini-commerce-app-0.0.1.jar k8s-mini-commerce-app-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/k8s-mini-commerce-app-0.0.1.jar"]