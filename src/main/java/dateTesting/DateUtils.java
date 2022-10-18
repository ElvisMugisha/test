package dateTesting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static void main(String args[]) {
//        Instantiate a date object
//        Date date1 = new Date();
//        date1.setMonth(10);
//        Date date2 = new Date();
//
//        boolean dateCompare = date1.after(date2);
//
//        System.out.println(dateCompare);
//        System.out.println(date1);

        Date dNow = new Date( );

        long start = System.currentTimeMillis();

        SimpleDateFormat ft =
                new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//        Current Date: Sat 2022.10.01 at 05:28:15 PM EET
        SimpleDateFormat ft2 =
                new SimpleDateFormat ("E yyyy.MMM.dd 'At' HH:mm");
        System.out.println("Current Date: " + ft.format(dNow));

        System.out.println(start);

//        long end = System.currentTimeMillis();

//        long proccessingTime = end - start;
//
//        System.out.println(proccessingTime);

        System.out.println("Current Date: " + ft2.format(dNow));
    }
}
