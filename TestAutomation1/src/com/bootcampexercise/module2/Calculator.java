package src.com.bootcampexercise.module2;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;
        System.out.println("Subtraction of "+num1 +" and "+num2+subtract(num1, num2));
        System.out.println(num1 + " divided by " + num2 + " = " + divide(num1, num2));
    }

    static int subtract(int num1, int num2) {
        int subtract = (num1>num2) ? num1-num2: num2-num1;
        return subtract;
    }

    static float divide(int num1, int num2) {
         float divided = num1/num2;
         return divided;
    }

}
