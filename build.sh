#!/bin/bash

rm -rf testresults
mkdir testresults

# prepare dirs for build tools dimension
mkdir testresults/mvn
mkdir testresults/gradle
mkdir testresults/ant
mkdir testresults/node

# karma
cd karma
rm TESTS-*.xml
# be sure that any old node_modules things are removed so we can assume
# that running karma will work
rm -rf node_modules
npm install
./node_modules/karma/bin/karma start karma.conf.js
cd ..

# runner is karma
mkdir testresults/node/karma

# reporter is junit (see karma.conf.js)
mkdir testresults/node/karma/junit

# copy over results
cp karma/*.xml testresults/node/karma/junit


# FitNesse (runs on Ant)
cd fitnesse
./gradlew cleanFitNesse testReference
cd ..
mkdir testresults/ant/fitnesse
cp -R fitnesse/FitNesseRoot testresults/ant/fitnesse

# Gradle with Junit
cd gradlejunit
./gradlew clean test
cd ..
mkdir testresults/gradle/junit
cp gradlejunit/build/test-results/*.xml testresults/gradle/junit

# Maven surefire junit
cd mvnjunit
mvn clean test
cd ..
mkdir testresults/mvn/surefire-junit
cp mvnjunit/target/surefire-reports/*.xml testresults/mvn/surefire-junit

# Maven + Cucubumber
cd mvnjunitcucumber
mvn clean test
cd ..
mkdir testresults/mvn/cucumber

# xml format
mkdir testresults/mvn/cucumber/xml
cp mvnjunitcucumber/target/surefire-reports/*.xml testresults/mvn/cucumber/xml

# json format
mkdir testresults/mvn/cucumber/json
cp mvnjunitcucumber/target/*.json testresults/mvn/cucumber/json

# Maven surefire TestNG
cd mvntestng
mvn clean test
cd ..
mkdir testresults/mvn/surefire-testng
cp mvntestng/target/surefire-reports/*.xml testresults/mvn/surefire-testng

# Gradle and TestNG
cd gradletestng
./gradlew clean testJunitReportReporter
cd ..
mkdir testresults/gradle/testng

# the default reporter
mkdir testresults/gradle/testng/default
cp -R gradletestng/build/test-results/*.xml testresults/gradle/testng/default
 
# the JUnitReportReporter
mkdir testresults/gradle/testng/junitreportreporter
cp -R gradletestng/build/reports/tests/junitreports/*.xml testresults/gradle/testng/junitreportreporter