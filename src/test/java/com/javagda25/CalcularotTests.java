package com.javagda25;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class CalcularotTests {

    private static Calculator calculator;

    @BeforeClass
    public static void funkcjaWywolanaRazPrzedWszystkimiTestami(){
        System.out.println("Rozpoczynam testy w klasie " + CalcularotTests.class);
        calculator = new Calculator();
    }

    @Before
    public void funkcjaPrzedKazdymTestem(){
        System.out.println("Testowanko");
    }

    @Test
    public void calculatorShouldReturn10WhenAdding5And5() {
        int sumResult = calculator.sum(5, 5);

        Assert.assertNotNull(calculator);

        // zapewniam, że wynik sumowania powinien być 10, nie gwarantuje, że jest
        Assert.assertEquals(10, sumResult);
    }

    @Test
    public void calculatorShouldReturn10WhenAdding6And4() {
        int sumResult = calculator.sum(6, 4);

        Assert.assertNotNull(calculator);

        // zapewniam, że wynik sumowania powinien być 10, nie gwarantuje, że jest
        Assert.assertEquals(10, sumResult);
    }
}
