package lab6;

import java.util.Scanner;

public abstract class SuperClass {

    public void getResult(Figure a, Figure b) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите арифметическую операцию (+, -, *, /):");
            char op = scanner.nextLine().charAt(0);
            System.out.println("Результат вычисления: " + (a.getArea() + b.getArea()));
        }
    }

}
