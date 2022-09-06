package lab3;

import java.util.Date;

/*
Напишите программу, в которой определяется время и дата через 1 000 000 секунд после текущей
даты и времени.
 */
public class Task4 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Текущая дата: " + date);
        date.setTime(date.getTime() + 1_000_000_000);
        System.out.println("Дата после добавления 1 000 000 секунд: " + date);
    }
}
