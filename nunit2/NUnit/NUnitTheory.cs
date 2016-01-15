using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace Reference
{
    /* using example from http://nunit.org/index.php?p=theory&r=2.6.4 */

    [TestFixture]
    public class TheorySuccess
    {
        [Datapoints]
        public double[] values = new double[] { 0.0, 1.0, 42.0 };

        [Theory]
        public void theorySuccess(double num)
        {
            Assume.That(num >= 0.0);

            double sqrt = Math.Sqrt(num);

            Assert.That(sqrt >= 0.0);
            Assert.That(sqrt * sqrt, Is.EqualTo(num).Within(0.000001));
        }
    }

    [TestFixture]
    public class TheorySuccessWithOneFalseAssumption
    {
        [Datapoints]
        public double[] values = new double[] { 0.0, 1.0, -1.0, 42.0 };

        [Theory]
        public void theorySuccessWithOneFalseAssumption(double num)
        {
            Assume.That(num >= 0.0);

            double sqrt = Math.Sqrt(num);

            Assert.That(sqrt >= 0.0);
            Assert.That(sqrt * sqrt, Is.EqualTo(num).Within(0.000001));
        }
    }

    [TestFixture]
    public class TheoryAssumptionFailsForAll
    {
        [Datapoints]
        public double[] values = new double[] { 0.0, 1.0, -1.0, 42.0 };

        [Theory]
        public void theoryAssumptionFailsForAll(double num)
        {
            Assume.That(num >= 50.0);

            double sqrt = Math.Sqrt(num);

            Assert.That(num >= 0.0);

            Assert.That(sqrt >= 0.0);
            Assert.That(sqrt * sqrt, Is.EqualTo(num).Within(0.000001));
        }
    }

    [TestFixture]
    public class TheoryAssertFail
    {
        [Datapoints]
        public double[] values = new double[] { 0.0, 1.0, -1.0, 42.0 };

        [Theory]
        public void theoryAssertFail(double num)
        {
            Assume.That(num >= 0.0);

            double sqrt = Math.Sqrt(num);

            Assert.That(sqrt >= 5.0);
            Assert.That(sqrt * sqrt, Is.EqualTo(num).Within(0.000001));
        }
    }


}
