# file Dockerfile
FROM openjdk:8-jre
ADD eureka-test-client-*.jar app.jar
ADD run.sh run.sh
RUN chmod +x run.sh
RUN sh -c 'touch /app.jar'
EXPOSE 8080
CMD ./run.sh