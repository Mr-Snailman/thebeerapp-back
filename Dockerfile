FROM openjdk:11-jdk-slim
RUN mkdir /app
ENV profile "default"
WORKDIR /app
EXPOSE 8090
ENTRYPOINT java -Dspring.profiles.active=${profile} -jar thebeerapp.jar ${args}
COPY ./target/thebeerapp.jar /app

