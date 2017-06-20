package com.mastodon;


import com.mastodon.TestingAndDebugging.UIandUnitActivity;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class ValidatorMethods {
    private UIandUnitActivity tester = new UIandUnitActivity();

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        float actual = tester.convertCelsiusToFahrenheit(100);
        // expected value is 212
        float expected = 212;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        float actual = tester.convertFahrenheitToCelsius(212);
        // expected value is 100
        float expected = 100;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }
}