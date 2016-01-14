# Reference project for NUnit 2.x files

## Prerequisites

* Install .NET Framework 4.5.2
* Install Visual Studio Community 2015
* NUnit 2.4.6 (if you do not wish to use the gradle build)
* Java (if you wish to use the gradle build)

## Building with Gradle

The gradle build will not run on a unix system at all (obviously).

To build the solution:

    gradlew msbuild

To generate the NUnit results run:

    gradlew nunit

Output is in `build/nunit`.

## Building with Visual Studio

* Make sure nunit-console is on the path
* Open the solution file (NUnit.sln)
* Build the solution
* From command line, run nunit-console NUnit/nunit.csproj

