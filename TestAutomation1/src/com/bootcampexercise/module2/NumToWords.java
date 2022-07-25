package src.com.bootcampexercise.module2;

public class NumToWords {
    public static void main(String[] args) {

        int x = 5;
        switch(x) {
            case 1:
                System.out.println("The number is "+x+" = ONE");
                break;
            case 2:
                System.out.println("The number is "+x+" = TWO");
                break;
            case 3:
                System.out.println("The number is "+x+" = THREE");
                break;
            case 4:
                System.out.println("The number is "+x+" = FOUR");
                break;
            case 5:
                System.out.println("The number is "+x+" = FIVE");
                break;
            case 6:
                System.out.println("The number is "+x+" = SIX");
                break;
            case 7:
                System.out.println("The number is "+x+" = SEVEN");
                break;
            case 8:
                System.out.println("The number is "+x+" = EIGHT");
                break;
            case 9:
                System.out.println("The number is "+x+" = NINE");
                break;
            case 10:
                System.out.println("The number is "+x+" = TEN");
                break;
            default:
                System.out.println("The number is out of range");
        }

    }
}
