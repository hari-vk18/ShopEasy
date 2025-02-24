FROM openjdk:21-jdk-slim
EXPOSE 8080
ADD target/shop-easy-application.jar shop-easy-application.jar
ENTRYPOINT [ "java", "-jar", "/shop-easy-application.jar" ]