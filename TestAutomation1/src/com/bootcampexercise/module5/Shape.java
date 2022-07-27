package src.com.bootcampexercise.module5;

//TODO: change Shape class to abstract
public abstract class Shape {

    public String color;
    public double length;
    public double breadth;
    public double radius;
    public Shape() {
    }

    //TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double
    public abstract double calculateArea();

    public abstract double calculatePerimeter();


    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
}
