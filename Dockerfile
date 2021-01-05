FROM adoptopenjdk/openjdk11
 
COPY target/mykids-0.0.1-SNAPSHOT.jar /mykids.jar
 
CMD ["java", "-Xmx200m", "-jar", "/mykids.jar"]