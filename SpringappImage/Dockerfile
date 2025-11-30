# step1 build maven
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Step 2 - JDK 21 to run the app
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

#step 3
From tomcat:9.0
COPY target/*.jar /usr/local/tomcat/webapps/ROOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
