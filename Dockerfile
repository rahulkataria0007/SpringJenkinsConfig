From openjdk:8
Expose 8080
ADD target/SpringJenkinBuild-0.0.1-SNAPSHOT.jar SpringJenkinBuild-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringJenkinBuild-0.0.1-SNAPSHOT.jar"]
