package lab6;

public abstract class Figure {

    private double area;
    private String color;
    double a;

    abstract public double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
