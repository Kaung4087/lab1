FROM amazoncorretto:25

COPY ./target/lab1-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp/app.jar

WORKDIR /tmp

ENTRYPOINT ["java", "-jar", "app.jar"]