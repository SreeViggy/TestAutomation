package src.com.bootcampexercise.module2;

public class MultiplicationTable {
    public static void main (String[] args) {
        for(int i =11; i <=20;i++){
            for (int j=1; j<=10;j++){
                System.out.println(i+" Table");
                System.out.println(i + "*" + j + " = "+i*j);
            }
        }
    }
}
