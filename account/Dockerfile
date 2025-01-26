FROM openjdk:21-jdk

WORKDIR /app

COPY ./build/libs/account-0.0.1-SNAPSHOT.jar accounts.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "accounts.jar"]