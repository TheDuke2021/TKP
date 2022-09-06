package lab1;

import java.util.Scanner;

public class MyConsole {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Привет. Как зовут?");
            String name = scanner.nextLine();
            System.out.println("Сколько годиков?");
            String age = scanner.nextLine();
            System.out.println("Привет, " + name + ", которому " + age + " годиков :)");
        }
    }

}
