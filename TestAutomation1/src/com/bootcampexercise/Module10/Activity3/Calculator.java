package src.com.bootcampexercise.Module10.Activity3;


import java.util.InputMismatchException;

/**
 * @author vigneshkrishnan
 */
    public class Calculator {


        // Create 4 Arithmetic methods
        // Add
        public double add(double x, double y) {
            double sum = x + y;
            return sum;
        }

        //Function Overloading
        public double add(double x, double y, double z) {
            double sum = x + y + z;
            return sum;
        }

        // Subtract
        public double subtract(double x, double y) {
            double diff = 0;
            diff = (x>y) ? (x-y) : (y-x);
            return diff;
        }

        // Multiply
        public double multiply(double[] numbers) {
            double num = 1;
            try {
                boolean isNumNegative = false;
                for (int i = 0; i < numbers.length; i++) {
                    num = num * numbers[i];
                    if(numbers[i] < 0)
                        isNumNegative = true;
                }
                if(isNumNegative)
                    throw new CustomException();

            }
            catch (CustomException e) {
                System.out.println(e.getMessage());
            }
            return num;
        }

        // Divide
        public String divide(double x, double y) {
            double divValue = 0;
            String errorMessage = "";
            try {
                if (x <= 0 || y <= 0) {
                    errorMessage = "The number is zero or negative";
                    return errorMessage;
                } else {
                    divValue = x%y;
                }
            }
            catch(InputMismatchException InputMismatchException) {
                System.out.println("Input mismatch Exception caught");
            }
            return ""+divValue;
        }
    }


