FROM eclipse-temurin:21-jre-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} learn-github-workflow-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/learn-github-workflow-0.0.1-SNAPSHOT.jar"]
