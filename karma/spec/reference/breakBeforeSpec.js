describe("Breaks in before function", function() {

    beforeEach(function() {
        throw "Goodbye!"
    });

    it("should never execute", function() {
        expect(true).toEqual(true);
    });

});
