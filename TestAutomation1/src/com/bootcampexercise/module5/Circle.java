package src.com.bootcampexercise.module5;

public class Circle extends Shape{
    // TODO: Implement calculateArea and calculatePerimeter in this class

    public double calculateArea() {
        return 3.14*radius*radius;
    }
    public double calculatePerimeter() {
        return 2*3.14*radius;
    }
}
