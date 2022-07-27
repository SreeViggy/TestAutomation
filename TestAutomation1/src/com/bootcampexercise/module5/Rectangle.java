package src.com.bootcampexercise.module5;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
    public double calculateArea()
    {
        return 2*this.length*this.breadth;
    }
    public double calculatePerimeter()
    {
        return this.length*this.breadth;
    }
}
