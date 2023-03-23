FROM maven:3.8.3-openjdk-18

COPY . /usr/src/app

RUN apt-get update -y && apt-get install -y libmariadb-dev
RUN docker-php-ext-install mysqli

RUN mvn -f /usr/src/app/pom.xml clean package

EXPOSE 8080

CMD ["java", "-jar", "/usr/src/app/target/my-application.jar"]