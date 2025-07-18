FROM openjdk:21-jdk-slim
#Set working directory
WORKDIR /app
#Copy the buildd jar file
COPY manufacture/target/manufacture-0.0.1-SNAPSHOT.jar app.jar
#Expose the port your app runs on
EXPOSE 8081
#Run the jar file
ENTRYPOINT ["java","-jar","app.jar"]
