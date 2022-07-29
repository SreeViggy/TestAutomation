package src.com.bootcampexercise.Module10.Actvity3;

import junit.framework.TestCase;
import org.junit.Assert;
import src.com.bootcampexercise.Module9.Person;

/**
 * @author vigneshkrishnan
 */

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    // create set up
    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables
        calculator = new Calculator();
    }

    //create teardown
    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters

    public void testAdd() {
        double num1 = 10;
        double num2 = 20;
        double num3 = 50;
        double sum = num1 + num2;

        //TC1 - To add 2 positive numbers with 2 inputs
        Assert.assertEquals(sum, calculator.add(num1, num2), 0.02);

        //TC2 - To add 2 decimal numbers with 2 inputs
        num1 = 1.23;
        num2 = 2.5;
        sum = num1 + num2;
        Assert.assertEquals(sum, calculator.add(num1, num2), 0.02);

        //TC3 - To add 3 positive numbers with 3 inputs
        num1 = 30;
        num2 = 50;
        sum = num1 + num2 + num3;
        Assert.assertEquals(sum, calculator.add(num1, num2, num3), 0.02);

        //TC4 - To add 2 decimal Numbers with inputs
        num1 = 12.56;
        num2 = 34.90;
        sum = num1 + num2;
        Assert.assertEquals(sum, calculator.add(num1, num2), 0.02);

        //TC5 - To add one positive and one negative numbers
        num1 = -10;
        num2 = 20;
        sum = num1 + num2;
        Assert.assertEquals(sum, calculator.add(num1, num2), 0.02);

        //TC6 - To add 3 negative numbers
        num1 = -10;
        num2 = -20;
        num3 = -90;
        sum = num1 + num2 + num3;
        Assert.assertEquals(sum, calculator.add(num1, num2, num3), 0.02);

    }

    public void testSubtract() {
        //TC7 - To subtract 2 positive numbers
        double num1 = 20;
        double num2 = 30;
        double subtract = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        Assert.assertEquals(subtract, calculator.subtract(num1, num2), 0.02);

        //TC8 - To subtract 1 positive and 1 negative numbers
        num1 = 35;
        num2 = -10;
        subtract = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        Assert.assertEquals(subtract, calculator.subtract(num1, num2), 0.02);

        //TC9 - To subtract 2 negative numbers
        num1 = -35;
        num2 = -10;
        subtract = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        Assert.assertEquals(subtract, calculator.subtract(num1, num2), 0.02);

        //TC10 - To subtract 2 decimal numbers
        num1 = 2.34;
        num2 = 3.54;
        subtract = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        Assert.assertEquals(subtract, calculator.subtract(num1, num2), 0.02);
    }

    public void testMultiply() {
        //TC11 - To multiply an array of 3 numbers
        double[] num = {20, 30, 67};
        double multiplied = 1;
        for(int i = 0; i < num.length; i++) {
            multiplied = multiplied * num[i];
        }
        Assert.assertEquals(multiplied, calculator.multiply(num), 0.02);

        //TC12 - To multiply an array of 3 positive and one negative numbers
        num = new double[]{20, 30, 67, -20};
        multiplied = 1;
        for(int i = 0; i < num.length; i++) {
            multiplied = multiplied * num[i];
        }
        Assert.assertEquals(multiplied, calculator.multiply(num), 0.02);

        //TC13 - To multiply an array of all negative numbers
        num = new double[]{-20, -30, -67, -20};
        multiplied = 1;
        for(int i = 0; i < num.length; i++) {
            multiplied = multiplied * num[i];
        }
        Assert.assertEquals(multiplied, calculator.multiply(num), 0.02);
    }

    public void testDIvide() {
        //TC14 - To divide 2 positive numbers
        double num1 = 12;
        double num2 = 45;
        double divided = num1 % num2;
        Assert.assertEquals(""+divided, ""+calculator.divide(num1, num2));

        //TC15 - To divide one positive and one negative numbers
        num1 = 12;
        num2 = -45;
        String errorMessage = "The number is zero or negative";
        Assert.assertEquals(errorMessage, ""+calculator.divide(num1, num2));

        //TC16 - To divide two negative numbers
        num1 = -12;
        num2 = -45;
        Assert.assertEquals(errorMessage, calculator.divide(num1, num2));
    }
}
