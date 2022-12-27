FROM maven:3.8.6-eclipse-temurin-17-focal AS builder

WORKDIR /app

ADD . /app

RUN --mount=type=cache,target=/root/.m2 mvn -f /app/pom.xml clean package

FROM eclipse-temurin:17-jdk-focal
 
COPY --from=builder /app/target/mykids*.jar /mykids.jar
 
CMD ["java", "-Xmx200m", "-jar", "/mykids.jar"]