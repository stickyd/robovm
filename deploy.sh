#!/bin/bash
set -e

VERSION=$1

./version.sh $VERSION

mvn deploy -Durl=http://ppbuilds.servebeer.com:8081/repository/internal/ -DrepositoryId=ppbuilds
mvn -f plugins/idea/pom.xml deploy -Durl=http://ppbuilds.servebeer.com:8081/repository/internal/ -DrepositoryId=ppbuilds
./plugins/gradle/gradlew -b plugins/gradle/build.gradle assemble publish -Dversion=${VERSION}