FROM maven:3.8.3-openjdk-17 as BUILD-APPS

LABEL DEVELOPER="diyansetiyadi@gmail.com"
LABEL APPS-NAME="bill-topup-service"
WORKDIR /build-apps

COPY . /build-apps/

RUN mvn verify -Dmaven.test.skip -q

RUN mvn clean install -Dmaven.test.skip -q

FROM openjdk:17-alpine as RUN-APPS
USER root
WORKDIR /apps
COPY --from=BUILD-APPS /build-apps/app/target/*.jar /apps/apps.jar
# COPY app/target/app.jar /apps
RUN ls -ltr
ENTRYPOINT [ "java","-jar","app.jar"]
