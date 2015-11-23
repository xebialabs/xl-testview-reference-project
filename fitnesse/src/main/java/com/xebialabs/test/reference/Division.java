package com.xebialabs.test.reference;

public class Division {
    private double numerator, denominator;

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double quotient() {
        if (denominator == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }
        return numerator / denominator;
    }
}