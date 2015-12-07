# Gradle with TestNG

## Generating results

### For default results:

Run `gradle test`

### For `org.testng.reporters.JUnitReportReporter` results:

Run `gradle testJunitReportReporter`

## Difference between 'default' result files and explicitly using org.testng.reporters.JUnitReportReporter
By default Gradle supports generating test results for TestNG. 

You could, if you want, explicitly specify which reporter to use for TestNG. For instance the `org.testng.reporters.JUnitReportReporter`

Do note that this reporter produces slightly different JUnit formats than the default xUnit formats.

