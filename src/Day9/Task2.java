package Day9;

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 25);
        Rectangle rectangle = new Rectangle("Black", 20, 25);
        Triangle triangle = new Triangle("Green", 10, 11, 12);
        circle.area();
        circle.perimeter();
        rectangle.area();
        rectangle.perimeter();
        triangle.area();
        triangle.perimeter();
    }
}
