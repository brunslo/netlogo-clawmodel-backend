FROM maven:3.6.0-jdk-8-slim AS builder
WORKDIR /build

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /build/src/
RUN mvn package

FROM openjdk:8-jdk-slim
EXPOSE 8080

RUN groupadd -g 999 appuser && \
    useradd -r -u 999 -g appuser appuser

COPY models /models
COPY extensions /extensions
COPY --from=builder --chown=appuser:appuser /build/target/backend-*.jar /backend.jar

USER appuser

CMD "/backend.jar"