FROM eclipse-temurin:23
LABEL author="otavio" maintainer="otavio@dev.com"
WORKDIR /cadastroAPP
COPY target/cadastroDeNinjas-0.0.1-SNAPSHOT.jar /cadastroAPP/testeImage.jar
ENTRYPOINT ["java", "-jar", "testeImage.jar"]
EXPOSE 8080