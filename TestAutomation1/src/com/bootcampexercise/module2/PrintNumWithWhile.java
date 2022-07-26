package src.com.bootcampexercise.module2;

public class PrintNumWithWhile {
    public static void main(String args[]){
        int i = 1;
        while(i <= 100) {
            if(i%2 != 0)
                    System.out.println(i + "is a odd number");
            i++;

        }
    }
}
