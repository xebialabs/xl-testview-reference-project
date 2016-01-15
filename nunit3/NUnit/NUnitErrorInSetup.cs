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
        [SetUp]
        public void Setup()
        {
            throw new ArgumentException();
        }

        [Test]
        public void TestSomething()
        {
            Assert.That(true, Is.True);
        }
    }

    [TestFixture]
    public class NUnitErrorInTearDown
    {
        [TearDown]
        public void Teardown()
        {
            throw new ArgumentException();
        }

        [Test]
        public void TestSomething()
        {
            Assert.That(true, Is.True);
        }
    }

    [TestFixture]
    public class NUnitErrorInFixtureSetup
    {
        [TestFixtureSetUp]
        public void Setup()
        {
            throw new ArgumentException();
        }

        [Test]
        public void TestSomething()
        {
            Assert.That(true, Is.True);
        }
    }

    public class NUnitErrorInFixtureTearDown
    {
        [TestFixtureTearDown]
        public void Teardown()
        {
            throw new ArgumentException();
        }

        [Test]
        public void TestSomething()
        {
            Assert.That(true, Is.True);
        }
    }
}
