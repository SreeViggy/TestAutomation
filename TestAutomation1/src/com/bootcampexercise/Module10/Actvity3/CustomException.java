package src.com.bootcampexercise.Module10.Actvity3;

public class CustomException extends Exception{
    @Override
    public String getMessage() {
        //System.out.println("You are not allowed to use this program");
        return "One of the numbers provided is negative ";
    }
}
