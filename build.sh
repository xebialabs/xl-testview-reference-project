#!/bin/bash

rm -rf testresults
mkdir testresults

# karma
cd karma
rm TESTS-*.xml
# be sure that any old node_modules things are removed so we can assume
# that running karma will work
rm -rf node_modules
npm install
./node_modules/karma/bin/karma start karma.conf.js
cd ..
mkdir testresults/karma
cp karma/*.xml testresults/karma/

# FitNesse
cd fitnesse
./gradlew cleanFitNesse testReference
cd ..
mkdir testresults/fitnesse
cp -R fitnesse/FitNesseRoot testresults/fitnesse

# gradle junit
cd gradlejunit
./gradlew clean test
cd ..
mkdir testresults/gradlejunit
cp gradlejunit/build/test-results/*.xml testresults/gradlejunit

# Maven surefire + junit
cd mvnjunit
mvn clean test
cd ..
mkdir testresults/mvnjunit
cp mvnjunit/target/surefire-reports/*.xml testresults/mvnjunit

# cucubumber + junit
cd mvnjunitcucumber
mvn clean test
cd ..
mkdir testresults/mvnjunitcucumber
cp mvnjunitcucumber/target/surefire-reports/*.xml testresults/mvnjunitcucumber
cp mvnjunitcucumber/target/*.json testresults/mvnjunitcucumber

# Maven Surefire + TestNG
cd mvntestng
mvn clean test
cd ..
mkdir testresults/mvntestng
cp mvntestng/target/surefire-reports/*.xml testresults/mvntestng

# Gradle + TestNG
cd testng
./gradlew clean test
cd ..
mkdir testresults/testng
cp -R testng/build/test-results/*.xml testresults/testng
 
