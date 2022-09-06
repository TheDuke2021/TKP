package lab3;

import java.util.Scanner;

/*
Напишите программу с методом, которым текст отображается в консоли, причем каждое слово из
текста отображается в отдельной строке.
 */
public class Task3 {

    public static void main(String[] args) {

        String str;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите текст:");
            str = scanner.nextLine();
        }

        String array[] = str.split("[ ,?.!:;—]");
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(""))
                System.out.println(array[i]);
        }
    }
}
