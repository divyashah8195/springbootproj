FROM openjdk:17
COPY target/springbootproj.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java", "-jar", "springbootproj.jar"]
