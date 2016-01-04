# Reference project for TRX files

There are two runners for DLL's:
* mstest is the legacy test runner.
* vstest.console is the new runner.

There are slight differences in how they deal with ignored tests and timeouts. Ignored tests are not shown in mstest generated output files. Tests that fail due to timeout are counted as a failure by vstest.console and as a timeout by mstest.

Both generate per default files with timestamps in a directory.

## Prerequisites

* Install .NET Framework 4.5.2
* Powershell 3.0 (at least Windows Management Framework 4.0)
* Install Visual Studio Community 2015
* Java (if you want to use the gradle build)

## Building with Gradle

The gradle build will not run on a unix system at all (obviously).

To build the solution:

    gradlew msbuild

To generate the mstest results run:

    gradlew mstest

Output is in `build/mstest`.

To generate the vstest.console results run:

    gradlew vstestConsole

Output is in `build/vstest`.

## Building with Visual Studio

* Import the solution file (VSTstTrx.sln)
* Build the solution
* Open a 'Developer command prompt for VS2015'
* To generate a report with mstest:
    mstest /testcontainer:VSTstTrx\bin\Debug\VSTstTrx.dll

  Results are in: TestResults\<user>_<machine> <timestamp>.trx

* To generate a report with vstest.console:
    vstest.console /logger:trx VSTstTrx\bin\Debug\VSTstTrx.dll

  Results are in: TestResults\<user>_<machine> <timestamp>.trx
