package com.jgilbride.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests
{
    @Test
    public void calculatorPositiveAdditionTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Positive Addition test...");

        calculator.addValues(150, 100);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = 250;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorPositiveSubtractTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Positive Subtract test...");

        calculator.subtractValues(100, 50);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = 50;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorPositiveMultiplicationTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Positive Multiplication test...");

        calculator.multiplyValues(10, 10);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = 100;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorPositiveDivisionTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Positive Division test...");

        calculator.divideValues(100, 10);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = 10;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorNegativeAdditionTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Negative Addition test...");

        calculator.addValues(-150, -100);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = -250;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorNegativeSubtractTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Negative Subtract test...");

        calculator.subtractValues(-100, -50);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = -50;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorNegativeMultiplicationTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Negative Multiplication test...");

        calculator.multiplyValues(-10, -10);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = 100;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorNegativeDivisionTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Negative Division test...");

        calculator.divideValues(-100, -10);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = 10;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorPositiveZeroMultiplicationTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Positive Zero Multiplication test...");

        calculator.multiplyValues(10, 0);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = 0;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorPositiveZeroDivisionTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Positive Zero Division test...");

        calculator.divideValues(100, 0);

        String actual = calculator.textField.getText();
        String expected = "Infinity";

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorNegativeZeroMultiplicationTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Negative Zero Multiplication test...");

        calculator.multiplyValues(-10, 0);

        int actual = Integer.parseInt(calculator.textField.getText());
        int expected = 0;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorNegativeZeroDivisionTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Negative Zero Division test...");

        calculator.divideValues(-100, 0);

        String actual = calculator.textField.getText();
        String expected = "Infinity";

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorClearTest()
    {
        Calculator calculator = new Calculator(120, 180);

        System.out.println("Clear test...");

        calculator.clear();

        String actual = calculator.textField.getText();
        String expected = "0";

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
