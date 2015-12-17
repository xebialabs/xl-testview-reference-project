using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace Reference
{
    [TestClass]
    public class Trx
    {
        [TestMethod]
        public void succeed()
        {
            Assert.IsTrue(true);
        }
        
        [TestMethod]
        [Ignore]
        public void ignore()
        {
            Assert.Fail("should be ignored");
        }

        [TestMethod]
        public void inconclusiveWithoutMessage()
        {
            Assert.Inconclusive();
        }

        [TestMethod]
        public void inconclusiveWithMessage()
        {
            Assert.Inconclusive("Inconclusive");
        }

        [TestMethod]
        public void willFail()
        {
            Assert.Fail();
        }

        [TestMethod]
        public void failWithMessage()
        {
            Assert.Fail("true != false");
        }

        [TestMethod]
        public void exceptionWithMessage()
        {
            throw new ApplicationException("Exception with message");
        }

        [TestMethod]
        public void exceptionWithoutMessage()
        {
            throw new ApplicationException();
        }

        [TestMethod]
        [ExpectedException(typeof(ApplicationException))]
        public void expectedException()
        {
            throw new ApplicationException();
        }

        [TestMethod]
        [ExpectedException(typeof(ApplicationException), "An Application Exception is expected.")]
        public void expectedExceptionWithMessage()
        {
            throw new ApplicationException();
        }

        [TestMethod]
        public void throwError()
        {
            throw new SystemException();
        }

        [TestMethod]
        [Timeout(100)]
        public void timeOut()
        {
            System.Threading.Thread.Sleep(200);
        }
    }
}
