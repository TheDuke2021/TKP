package lab3;


import java.util.Scanner;

/*
Напишите программу с методом для отображения текстовой строки в обратном порядке
 */
public class Task1 {

    public static void main(String[] args) {
        String str;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            str = scanner.nextLine();
        }
        StringBuilder result = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        System.out.println("Обратная строка: \n" + result);

    }
}
