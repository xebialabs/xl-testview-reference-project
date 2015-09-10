describe("Ref test", function() {

  it("should succeed", function() {
    expect(true).toEqual(true);
  });

  it("should fail", function() {
    expect(true).toEqual(false);
  });

  xit("should ignore", function() {
    expect(true).toEqual(true);
  });

  it("should throw with message", function() {
    throw "Exception with message";
  });

  it("should throw with message", function() {
    throw new Error("Error with message");
  });

  it("should throw with message", function() {
    expect(function(){throw new Error("Expected error")}).toThrow(new Error("Expected error"));
  });

  it('should time out', function(done){
    setTimeout( done , 10 );
  }, 5); // changes to 10 seconds



});
