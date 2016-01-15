using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace Reference
{

    public class NUnitMain
    {
        static void Main(string[] args) {}
    }

    class CustomAction : TestActionAttribute
    {

    }

    class CustomActionFailsBefore : TestActionAttribute
    {
        public override void BeforeTest(TestDetails details)
        {
            throw new NotImplementedException("error");
        }

    }

    class CustomActionFailsAfter : TestActionAttribute
    {
        public override void AfterTest(TestDetails details)
        {
            throw new NotImplementedException("error");
        }
    }

    [TestFixture]
    public class NUnitTest
    { 
        [Test]
        public void success()
        {
            Assert.That(true, Is.True);
        }

        [Test]
        public void fail()
        {
            Assert.That(false, Is.True);
        }

        [Test]
        public void failWithMessage()
        {
            Assert.That(false, Is.True, "Failed message");
        }

        [Test, Ignore("Ignore")]
        public void ignore()
        {
            Assert.That(false, "should be ignored");
        }

        [Test]
        public void inconclusiveWithoutMessage()
        {
            Assert.Inconclusive();
        }

        [Test]
        public void inconclusiveWithMessage()
        {
            Assert.Inconclusive("Inconclusive");
        }


        [Test]
        public void exceptionWithMessage()
        {
            throw new ApplicationException("Exception with message");
        }

        [Test]
        public void exceptionWithoutMessage()
        {
            throw new ApplicationException();
        }

        [Test]
        public void expectedException()
        {
            Assert.Throws(typeof(ApplicationException), delegate { throw new ApplicationException(); } );
        }

        [Test]
        public void expectedExceptionWithMessage()
        {
            Exception e = Assert.Throws(typeof(ApplicationException), delegate { throw new ApplicationException("Exception with message"); });
            Assert.That(e.Message, Is.EqualTo("Exception with message"));
        }

        [Test]
        public void throwError()
        {
            throw new SystemException();
        }

        [Test, Timeout(100)]
        public void timeOut()
        {
            System.Threading.Thread.Sleep(200);
        }

        [Test, MaxTime(100)]
        public void maxTime()
        {
            System.Threading.Thread.Sleep(200);
        }

        [Test, Explicit]
        // an Explict test is executed only if it's specified during test execution
        // In NUnit 2.x it is reported in the results as Ignored, and in NUnit 3 as Explicit
        public void explicitTest()
        {
            Assert.That(true, Is.False, "should not be executed");
        }

        [Test]
        public void testWithValuesAllSuccess([Values(11, 12, 13)] int x)
        {
            Assert.That(true, Is.True);
        }

        [Test]
        public void testWithValuesPartialSuccess([Values(11, 12, 13)] int x)
        {
            Assert.That(x < 13);
        }

        [Test, Platform("Win98")]
        public void skipped()
        {
            Assert.That(true, Is.False);
        }

        [Test, CustomAction]
        public void customAction()
        {
            Assert.That(true, Is.True);
        }

        [Test, CustomActionFailsBefore]
        public void customActionFailsBefore()
        {
            Assert.That(true, Is.True);
        }

        [Test, CustomActionFailsAfter]
        public void customActionFailsAfter()
        {
            Assert.That(true, Is.True);
        }
    }
}
