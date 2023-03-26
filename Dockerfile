FROM openjdk

EXPOSE 8888

ARG JAR_FILE="target/Java-Crud-Sample-1.0-SNAPSHOT.jar"

ADD ${JAR_FILE} application.jar

ENTRYPOINT["java", "-jar", "/application.jar"]