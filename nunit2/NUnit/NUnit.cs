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
    
    [TestFixture]
    public class NUnitTest
    { 
        [Test]
        public void success()
        {
            Assert.True(true);
        }

        [Test]
        public void fail()
        {
            Assert.True(false);
        }

        [Test]
        public void failWithMessage()
        {
            Assert.True(false, "Failed message");
        }

        [Test]
        [Ignore("Ignore")]
        public void ignore()
        {
            Assert.False(true, "should be ignored");
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
        [ExpectedException(typeof(ApplicationException))]
        public void expectedException()
        {
            throw new ApplicationException();
        }

        [Test]
        [ExpectedException(typeof(ApplicationException), ExpectedMessage = "Exception with message")]
        public void expectedExceptionWithMessage()
        {
            throw new ApplicationException("Exception with message");
        }

        [Test]
        public void throwError()
        {
            throw new SystemException();
        }

        [Test]
        [Timeout(100)]
        public void timeOut()
        {
            System.Threading.Thread.Sleep(200);
        }

        [Test, Explicit]
        // an Explict test is executed only if it's specified during test execution
        // In NUnit 2.x it is reported in the results as Ignored, and in NUnit 3 as Explicit
        public void explicitTest()
        {
            Assert.True(false, "should not be executed");
        }

        [Test]
        public void testWithValuesAllSuccess([Values(11, 12, 13)] int x)
        {
            Assert.True(true);
        }

        [Test]
        public void testWithValuesPartialSuccess([Values(11, 12, 13)] int x)
        {
            Assert.True(x < 13);
        }

    }
}
