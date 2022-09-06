package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Напишите программу, в которой дата выводится в формате, в котором сначала следует год, затем
месяц, после этого – день месяца.
 */
public class Task6 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(new SimpleDateFormat("Дата: yyyy.MM.dd").format(date.getTime()));
    }
}
