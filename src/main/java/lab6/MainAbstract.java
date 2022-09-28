package lab6;
public class MainAbstract {
    public static void main(String[] args) {
        //Переменная абстрактного класса Figure
        Figure figure = new Square(10);
        System.out.println("Площадь квадрата: " + figure.getArea());
        figure = new Circle(10);
        System.out.println("Площадь круга: " + figure.getArea());
        figure = new Cube(10);
        System.out.println("Площадь куба: " + figure.getArea());
        Circle circle = new Circle(3);
        circle.setColor("Blue");
        System.out.println("Круг с цветом " + circle.getColor() + " и площадью "
                + circle.getArea());
        Cube cube = new Cube(4);
        System.out.println("Куб с площадью поверхности " + cube.getArea() + " и объёмом " + cube.getVolume());
    }
}
