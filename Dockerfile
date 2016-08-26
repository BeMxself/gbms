FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/gbms.jar /gbms/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/gbms/app.jar"]
