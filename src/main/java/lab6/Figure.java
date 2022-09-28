package lab6;
public abstract class Figure {
    private double area;
    private String color;
    abstract public double getArea();
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
