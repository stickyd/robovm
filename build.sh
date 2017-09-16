#!/bin/bash
set -e
mvn install -DskipTests=true
mvn -f plugins/idea/pom.xml install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle assemble install