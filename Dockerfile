From openjdk:8
Expose 8085
ADD target/SpringJenkinBuild-0.0.1-SNAPSHOT.jar SpringJenkinBuild-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringJenkinBuild-0.0.1-SNAPSHOT.jar"]
