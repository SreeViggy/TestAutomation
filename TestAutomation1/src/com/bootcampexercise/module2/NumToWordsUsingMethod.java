package src.com.bootcampexercise.module2;

public class NumToWordsUsingMethod {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++) {
            printWord(i);
        }

    }

    static void printWord(int x) {
        switch(x) {
            case 1:
                System.out.println(x+" = ONE");
                break;
            case 2:
                System.out.println(x+" = TWO");
                break;
            case 3:
                System.out.println(x+" = THREE");
                break;
            case 4:
                System.out.println(x+" = FOUR");
                break;
            case 5:
                System.out.println(x+" = FIVE");
                break;
            case 6:
                System.out.println(x+" = SIX");
                break;
            case 7:
                System.out.println(x+" = SEVEN");
                break;
            case 8:
                System.out.println(x+" = EIGHT");
                break;
            case 9:
                System.out.println(x+" = NINE");
                break;
            case 10:
                System.out.println(x+" = TEN");
                break;
            default:
                System.out.println("The number is out of range");
        }
    }
}
