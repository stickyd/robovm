#!/bin/bash
set -e
mvn versions:set -DnewVersion=${1}
mvn versions:commit

cd plugins/eclipse
mvn versions:set -DnewVersion=${1}
mvn versions:commit

cd ../idea
mvn versions:set -DnewVersion=${1}
mvn versions:commit

cd ../maven
mvn versions:set -DnewVersion=${1}
mvn versions:commit
