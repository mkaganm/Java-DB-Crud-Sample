FROM maven:latest

COPY Docker /Users/kagan.meric/IdeaProjects/myRepos/Java-Crud-Sample

RUN apt-get update -y && apt-get install -y libmariadb-dev
RUN docker-php-ext-install mysqli

RUN mvn -f /Users/kagan.meric/IdeaProjects/myRepos/Java-Crud-Sample/pom.xml clean package

EXPOSE 8080

BASH ["java", "-jar", "/Users/kagan.meric/IdeaProjects/myRepos/Java-Crud-Sample/target/Java-Crud-Sample-1.0-SNAPSHOT.jar"]