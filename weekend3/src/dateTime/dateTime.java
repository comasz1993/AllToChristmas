package dateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTime {
    public static void main(String[] args) {
        LocalDateTime aktualnaDataCzas = LocalDateTime.now();
        System.out.println("Data i czas przed formatowaniem: " + aktualnaDataCzas);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("E, hh:ss");
        String dataCzasPoFormacie=aktualnaDataCzas.format(formatter);

        System.out.println(dataCzasPoFormacie);

        String str = "1986-04-08 12:30";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter1);
        System.out.println(dateTime);

        DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(aktualnaDataCzas.format(formatter3));
    }
}
