To use:

* Install .NET Framework 4.5.2
* Powershell 3.0 (at least Windows Management Framework 4.0)
* Install Visual Studio Community 2015

mstest is the legacy test runner.
vstest.console is the new runner.

There are slight differences in how they deal with ignored tests and timeouts. Ignored tests are not shown in mstest generated output files. Tests that fail due to timeout are counted as a failure by vstest.console and as a timeout by mstest.

Both generate per default files with timestamps in a directory.

The gradle build will not run on a unix system at all.
