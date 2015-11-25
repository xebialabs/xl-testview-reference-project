# Test Results Reference Project
This project serves two purposes:

1. Generate test results for all kinds of tools in all kinds of situations. So that XL-TestView has one source of truth to depend its test-results parsers on.

2. Generate random results for importing test-data

## Things you must know when producing test results
There are roughly 3 variables when producing test results:

1. Which test tool is used? (jUnit, etc)
2. Which build tool is used? (Ant, Maven, etc)
3. Which reporting tool is used? (Maven Surefire? jUnit own reporter?)

test result files may be different when changing one of the variables. Therefor being very explicit about the variables is vital.

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
