
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/pricing-0.0.1-SNAPSHOT.jar /app/pricing-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "/app/pricing-0.0.1-SNAPSHOT.jar"]

