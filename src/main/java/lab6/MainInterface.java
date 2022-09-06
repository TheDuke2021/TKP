package lab6;

public class MainInterface {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        Square square = new Square();
        square.setA(5);
        Circle circle = new Circle();
        circle.setA(10);

        subClass.getResult(square, circle);
    }
}
