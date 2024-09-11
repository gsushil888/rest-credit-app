# Step 1: Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Step 2: Set the working directory in the container
WORKDIR /app

# Step 3: Copy the executable JAR file from the host to the container
COPY target/RestCreditScore.jar /app/RestCreditScore.jar

# Step 4: Expose the port on which your app runs
EXPOSE 9010

# Step 5: Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/RestCreditScore.jar"]

# Optional: You can pass environment variables for configuration here if needed
# ENV SPRING_PROFILES_ACTIVE=prod
