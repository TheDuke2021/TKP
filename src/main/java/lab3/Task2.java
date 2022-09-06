package lab3;

import java.util.Scanner;

/*
Напишите программу с методом для подсчета количества вхождений символа в текстовую строку
 */
public class Task2 {

    public static void main(String[] args) {

        String str;
        char symbol;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            str = scanner.nextLine();
            System.out.println("Введите символ:");
            symbol = scanner.nextLine().charAt(0);
        }
        int result = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == symbol)
                result++;
        }

        System.out.println("Число вхождений: " + result);


    }
}
