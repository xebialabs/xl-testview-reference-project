# Test Results Reference Project
This project serves two purposes:

1. Generate test results for all kinds of tools in all kinds of situations. So that XL TestView has one source of truth to depend its test result parsers on.

2. Generate random results for importing test-data

## Things you must know when producing test results
There are roughly 3 variables when producing test results:

1. Which test tool is used? (jUnit, etc)
2. Which build tool is used? (Ant, Maven, etc)
3. Which reporting tool is used? (Maven Surefire? jUnit own reporter?)

test result files may be different when changing one of the variables. Therefor being very explicit about the variables is vital.

## Build all test results
Simply run build.sh. This will build all projects and store the results in a folder called test-results
## Test tools

This project has the following tools supported:


|Build tool|Test tool|Format|
|----------|---------|------|
|NA|[Fitnesse](./fitnesse)|Fitnesse specific|
|[Cucumber](./mvnjunitcucumber)|Maven|JUnit|
|[TestNG](./testng)|Gradle|JUnit|
|[TestNG](./mvntestng)|Maven|JUnit|
|[JUnit](./mvnjunit)|Maven|JUnit|
|[JUnit](./gradlejunit)|Gradle|JUnit|
|[Karma](./karma)|Karma|JUnit|
|[TFS](./vststtrx)|VSTest/MSTest|TRX|
|[NUnit 2.x](./nunit2)|Nunit 2.x|NUnit 2.x|
|[NUnit 3.x](./nunit3)|NUnit 3.x|NUnit 3.x|
