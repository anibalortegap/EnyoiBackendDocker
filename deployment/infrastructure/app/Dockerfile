FROM amazoncorretto:17-alpine3.21
LABEL version='1.0.0' maintainer='anibalortegap@gmail.com' description='Ejemplo Docker + Spring Boot'cd
WORKDIR /app
COPY /build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]