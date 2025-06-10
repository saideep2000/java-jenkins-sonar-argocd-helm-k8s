FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /app

COPY pom.xml .

#install all the packages and cache until a change has been detected
RUN mvn dependency:go-offline -B
#RUN mvn dependency:go-offline -B -U

#copying all the source code
COPY src ./src

#package everything up in single jar
RUN mvn clean package

FROM openjdk:21-jdk AS runner

WORKDIR /app

#copy the patient service snapshot jar that was created in the builder set and going to copy at the runner
COPY --from=builder ./app/target/spring-boot-app-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]