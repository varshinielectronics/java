package abstraction;

// Abstract class
abstract class Shape {

    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Abstract method
    abstract double area();

    // Normal method
    void display() {
        System.out.println("Color: " + color);
    }
}

// Child class
class Rectangle extends Shape {

    double width, height;

    // Constructor
    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Implement abstract method
    @Override
    double area() {
        return width * height;
    }
}

// Main class
public class AbstractClassExample {

    public static void main(String[] args) {

        Shape rect = new Rectangle("Blue", 4.0, 5.0);

        rect.display();

        System.out.println("Area: " + rect.area());
    }
    }