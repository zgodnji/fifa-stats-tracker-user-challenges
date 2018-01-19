FROM openjdk:8-jre-alpine

RUN mkdir /app

WORKDIR /app

ADD ./target/user-challenges-1.0.0.jar /app

EXPOSE 8088

CMD ["java", "-jar", "user-challenges-1.0.0.jar"]
