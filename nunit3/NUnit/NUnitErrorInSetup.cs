using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace Reference
{
    [TestFixture]
    public class NUnitErrorInSetup
    {
        [TestFixtureSetUp]
        public void Setup()
        {
            throw new ArgumentException();
        }

        [Test]
        public void TestSomething()
        {
            Assert.True(true);
        }
    }
}
