package lab2;

import java.util.Scanner;


/*
Случайным образом генерируется массив чисел. Пользователь вводит числа a и b. Заменить элемент
массива на сумму его соседей, если элемент массива четный и номер его лежит в промежутке от a
до b.
 */
public class Task1 {

    public static void main(String[] args) {
        final int n = 20;
        int[] array = new int[n];
        System.out.println("Массив до изменения:");
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i] + " ");
        }

        int a, b;
        System.out.println("\nВведите a и b:");
        try(Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

        for(int i = 1; i < n-1; i++) {
            if(array[i] % 2 == 0 && i <= b && i >= a) {
                int sum = array[i-1] + array[i+1];
                array[i] = sum;
            }
        }

        System.out.println("Массив после изменения:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
