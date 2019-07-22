FROM openjdk:7-alpine
COPY . /usr/src/spring-example
WORKDIR /usr/src/spring-example
RUN ./gradlew check
CMD ["java", "Main"]
