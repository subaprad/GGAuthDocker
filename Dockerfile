FROM openjdk:8
EXPOSE 5555
ADD /target/gg-docker.jar gg-docker.jar
ENTRYPOINT ["java","-jar","/gg-docker.jar"]