#!/bin/bash

rm -rf test-results
mkdir test-results

# karma
cd karma
npm install
./node_modules/karma/bin/karma start karma.conf.js
cd ..
mkdir test-results/karma
cp karma/*.xml test-results/karma/

# FitNesse
cd fitnesse
./gradlew testReference
cd ..
mkdir test-results/fitnesse
cp -R fitnesse/FitNesseRoot test-results/fitnesse

# gradle junit
cd gradlejunit
./gradlew test
cd ..
mkdir test-results/gradlejunit
cp gradlejunit/build/test-results/*.xml test-results/gradlejunit

# Maven surefire + junit
cd mvnjunit
mvn test
cd ..
mkdir test-results/mvnjunit
cp mvnjunit/target/surefire-reports/*.xml test-results/mvnjunit

# cucubumber + junit
cd mvnjunitcucumber
mvn test
cd ..
mkdir test-results/mvnjunitcucumber
cp mvnjunitcucumber/target/surefire-reports/*.xml test-results/mvnjunitcucumber

# Maven Surefire + TestNG
cd mvntestng
mvn test
cd ..
mkdir test-results/mvntestng
cp mvntestng/target/surefire-reports/*.xml test-results/mvntestng

# Gradle + TestNG
cd testng
./gradlew test
cd ..
mkdir test-results/testng
cp -R testng/build/test-results/*.xml test-results/testng
 
