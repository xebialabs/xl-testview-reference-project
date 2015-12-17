using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace References
{
    [TestClass]
    public class TrxErrorInSetup
    {
        [TestInitialize]
        public void setupTrxErrorInSetup()
        {
            throw new ArgumentException();
        }

        [TestMethod]
        public void testInTrxErrorInSetup()
        {
            Assert.IsTrue(true);
        }
    }
}