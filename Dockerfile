FROM openjdk:11
ADD target/oblivion-head-hunter-1.0.jar oblivion-head-hunter-1.0.jar
ENTRYPOINT ["java", "-jar","oblivion-head-hunter-1.0.jar"]
EXPOSE 8080