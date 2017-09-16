#!/bin/bash
set -e

LOCAL_VERSION=$1
REPOSITORY_VERSION=$2

URL=http://ppbuilds.servebeer.com:8081/repository/maven-snapshots/
GROUP_ID=com.mobidevelop.robovm

echo "LOCAL_VERSION=${1}"
echo "REPOSITORY_VERSION=${2}"

# mvn deploy:deploy-file -Durl=${URL} -DpomFile=dist/package/pom.xml -Dfile=dist/package/target/robovm-${LOCAL_VERSION}.tar.gz -DgroupId=${GROUP_ID} -DartifactId=robovm-dist -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds

# mvn deploy:deploy-file -Durl=${URL} -DpomFile=pom.xml -Dfile=pom.xml -DgroupId=${GROUP_ID} -DartifactId=robovm-parent -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds
# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/pom.xml -Dfile=compiler/pom.xml -DgroupId=${GROUP_ID} -DartifactId=robovm-compiler-parent -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds

# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/cacerts/pom.xml -Dfile=compiler/cacerts/pom.xml -DgroupId=${GROUP_ID} -DartifactId=robovm-cacerts-parent -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds
# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/cacerts/full/pom.xml -Dfile=compiler/cacerts/full/target/robovm-cacerts-full-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-cacerts-full -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds

# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/cocoatouch/pom.xml -Dfile=compiler/cocoatouch/target/robovm-cocoatouch-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-cocoatouch -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds

# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/compiler/pom.xml -Dfile=compiler/compiler/target/robovm-compiler-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-compiler -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds










mvn deploy:deploy-file -Durl=${URL} -Dfile=dist/compiler/target/robovm-dist-compiler-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-dist-compiler -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds
# mvn deploy:deploy-file -Durl=${URL} -DpomFile=dist/compiler/pom.xml -Dfile=dist/compiler/target/robovm-dist-compiler-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-dist-compiler -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds

# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/cacerts/pom.xml -Dfile=compiler/cacerts/pom.xml -DgroupId=${GROUP_ID} -DartifactId=robovm-cacerts-parent -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds
# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/cacerts/full/pom.xml -Dfile=compiler/cacerts/full/target/robovm-cacerts-full-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-cacerts-full -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds


# mvn deploy:deploy-file -Durl=${URL} -DpomFile=dist/compiler/target/compiler/pom.xml -Dfile=dist/compiler/target/robovm-dist-compiler-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-dist-compiler -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds

# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/compiler/pom.xml -Dfile=compiler/compiler/target/robovm-compiler-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-compiler -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds

# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/objc/pom.xml -Dfile=compiler/objc/target/robovm-objc-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-objc -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds
# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/rt/pom.xml -Dfile=compiler/rt/target/robovm-rt-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-rt -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds
# mvn deploy:deploy-file -Durl=${URL} -DpomFile=compiler/cocoatouch/pom.xml -Dfile=compiler/cocoatouch/target/robovm-cocoatouch-${LOCAL_VERSION}.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-cocoatouch -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds


# # mvn deploy:deploy-file -Durl=${URL} -Dfile=plugins/idea/target/org.robovm.idea-${LOCAL_VERSION}-plugin-dist.jar -DgroupId=${GROUP_ID} -DartifactId=robovm-idea-plugin -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds
# # mvn deploy:deploy-file -Dfile=plugins/gradle/build/libs/robovm-gradle-plugin-${LOCAL_VERSION}.jar -DartifactId=robovm-gradle-plugin -DgroupId=${GROUP_ID} -Dversion=${REPOSITORY_VERSION} -DrepositoryId=ppbuilds -Durl=${URL}