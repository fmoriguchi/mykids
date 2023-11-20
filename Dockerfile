FROM maven:3.9.5-eclipse-temurin-21-alpine AS builder

WORKDIR /app

ADD . /app

RUN --mount=type=cache,target=/root/.m2 mvn -f /app/pom.xml clean package

FROM eclipse-temurin:21-alpine
 
COPY --from=builder /app/target/mykids*.jar /mykids.jar
 
CMD ["java", "-Xmx200m", "-jar", "/mykids.jar"]
