ARG CODE_VERSION="latest"
FROM gradle:${CODE_VERSION} AS gradle
ARG CODE_VERSION

RUN ["/bin/sh", "-c", "echo -e gradle:$CODE_VERSION"]

RUN apt-get install git && \
    git clone https://github.com/estenoesmiputonombre/tomacat.git tomacat

ENV GRADLE_HOME /home/gradle

WORKDIR $GRADLE_HOME/tomacat/byeWorld
    
RUN gradle war

FROM tomcat:9.0.24-jdk8-openjdk-slim

ENV CATALINA_HOME /usr/local/tomcat
WORKDIR /usr/local/tomcat

COPY --from=gradle /home/gradle/tomacat/byeWorld/build/libs webapps/

EXPOSE 8080

CMD ["/bin/sh", "-c", "catalina.sh run"]
