package src.com.bootcampexercise.module2;

public class FindInArray {

    public static void main(String[] args){

        int[] num = {2,4,6,8,10,12,14,16,18,20};

        int largest = num[0];

        // Find smallest in an array
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.println("Largest number in the given array is "+largest);
    }

}
