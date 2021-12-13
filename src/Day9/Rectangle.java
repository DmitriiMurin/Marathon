package Day9;

public class Rectangle extends Figure{

    private int width, height;

    public Rectangle(String colour, int width, int height) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        System.out.println("S of Rectangle =" + (width*height));
        return 0;
    }

    @Override
    public double perimeter() {
        System.out.println("P of Rectangle =" + (2*(width+height)));
        return 0;
    }



}
