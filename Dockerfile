FROM eclipse-temurin:17-jdk-focal
 
COPY target/mykids*.jar /mykids.jar
 
CMD ["java", "-Xmx200m", "-jar", "/mykids.jar"]