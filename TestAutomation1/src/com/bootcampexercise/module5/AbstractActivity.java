package src.com.bootcampexercise.module5;

public class AbstractActivity {
    public static void main(String args[]) {
        // set and Print color of rectangle
       Shape rectangle = new Rectangle();
       rectangle.setColor("Blue");
       System.out.println("The color of the rectangle is "+rectangle.getColor());
       rectangle.setLength(12);
       rectangle.setBreadth(20);
       System.out.println("The area of the rectangle is "+rectangle.calculateArea());
       System.out.println("The perimeter of the rectangle is "+rectangle.calculatePerimeter());

       Shape circle = new Circle();
       circle.setColor("Green");
       System.out.println("The color of the circle is "+circle.getColor());
       circle.setRadius(12);
       System.out.println("The color of the circle is "+circle.calculateArea());
       System.out.println("The color of the circle is "+circle.calculatePerimeter());

    }
}