From openjdk:8
Expose 8080
ADD target/SprinJenkinConf.jar SprinJenkinConf.jar
ENTRYPOINT ["java","-jar","SprinJenkinConf.jar"]