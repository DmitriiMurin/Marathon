package Day9;

public abstract class Figure {
    protected String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract double area();
    public abstract double perimeter();
}
