package oop.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{
    @Test
    public void includes_correct_calculations(){
        App myApp = new App();
        int num1 = 10;
        int num2 = 5;

        int sum = myApp.calcSum(num1, num2);
        int difference = myApp.calcDifference(num1, num2);
        int product = myApp.calcProduct(num1, num2);
        int quotient = myApp.calcQuotient(num1, num2);

        String expectedMessage = "10 + 5 = 15\n10 - 5 = 5\n10 * 5 = 50\n10 / 5 = 2";
        String actualMessage = myApp.generateMessage(num1, num2, sum,difference, product, quotient);

        assertEquals(expectedMessage, actualMessage);

    }
}
