FROM maven:3.9.4-eclipse-temurin-17-alpine AS builder

WORKDIR /app

ADD . /app

RUN --mount=type=cache,target=/root/.m2 mvn -f /app/pom.xml clean package

FROM eclipse-temurin:17-alpine
 
COPY --from=builder /app/target/mykids*.jar /mykids.jar
 
CMD ["java", "-Xmx200m", "-jar", "/mykids.jar"]
