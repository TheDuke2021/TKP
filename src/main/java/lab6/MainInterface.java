package lab6;
public class MainInterface {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        Square square = new Square(5);
        Circle circle = new Circle(10);
        subClass.getResult(square, circle);
    }
}