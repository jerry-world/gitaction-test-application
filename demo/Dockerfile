FROM gradle:9.1.0-jdk25 AS build
COPY --chown=gradle:gralde .. /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle :demo:build --no-daemon -x test

FROM amazoncorretto:25
COPY --from=build /home/gradle/src/demo/build/libs/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "app.jar"]