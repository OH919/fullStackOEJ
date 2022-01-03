package week2_5.homework;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(s.format(d));
    }
}