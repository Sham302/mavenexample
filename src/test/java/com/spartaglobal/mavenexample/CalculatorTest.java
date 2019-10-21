package com.spartaglobal.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void TestAddition(){
        Assert.assertEquals(4,calculator.add(2,2));
    }

    @Test
    public void TestSubtraction(){
        Assert.assertEquals(5, calculator.subtract(6,1));
    }

    @Test
    public void TestMultiplication(){
        Assert.assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    public void TestDivision(){
        Assert.assertEquals(3, calculator.division(6,2));
    }
}
