set -e
mvn install -DskipTests=true
mvn -f plugins/idea/pom.xml install