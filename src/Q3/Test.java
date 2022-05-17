package Q3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        String date= LocalDate.parse("2014-05-04").
                format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}
/*
what is the result?
a. May 04,2014T00:00:00.000
b.2014-05-04T00:00.000
c.5/4/14T00:00:00.000
d. an exception is thrown*/
