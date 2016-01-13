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

        [Test]
        [Ignore("Ignore")]
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

        [Test]
        [Timeout(100)]
        public void timeOut()
        {
            System.Threading.Thread.Sleep(200);
        }

        [Test, Explicit]
        // an Explict test is executed only if it's specified during test execution
        public void explicitTest()
        {
            Assert.That(true, Is.False, "should not be executed");
        }

    }
}
