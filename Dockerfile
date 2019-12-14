FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY build/libs/tourapp-*-all.jar tourapp.jar
EXPOSE 2019
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar tourapp.jar
