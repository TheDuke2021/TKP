package lab3;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
Напишите программу, в которой на заданном интервале времени случайно выбирается дата и
время, и для этой даты отображается день недели.
 */
public class Task5 {

    public static void main(String[] args) {
        int day1, month1, year1;
        int day2, month2, year2;
        System.out.println("Введите день, месяц и год первой точки интервала: ");
        try(Scanner scanner = new Scanner(System.in)) {
            day1 = scanner.nextInt();
            month1 = scanner.nextInt();
            year1 = scanner.nextInt();
            System.out.println("Введите день, месяц и год второй точки интервала: ");
            day2 = scanner.nextInt();
            month2 = scanner.nextInt();
            year2 = scanner.nextInt();
        }
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(year1, month1, day1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(year2, month2, day2);

        Calendar randomDate = Calendar.getInstance();
        randomDate.setTimeInMillis((long) ((Math.random()*(calendar2.getTimeInMillis()-calendar1.getTimeInMillis())) + calendar1.getTimeInMillis()));
        System.out.println("Рандомная дата: " + randomDate.getTime());
        System.out.println(new SimpleDateFormat("День недели: EEEE").format(randomDate.getTime()));

    }
}
