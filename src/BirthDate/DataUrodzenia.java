package BirthDate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class DataUrodzenia {
    public static void dataUrodzenia(String df) {
        if (df.matches("\\d{4}-\\d{2}-\\d{2}")) {
            String[] parts = df.split("-");

            LocalDate data = LocalDate.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));

            System.out.println("Day:");
            System.out.println(data.getDayOfWeek());
            System.out.println("Week of year:");
            System.out.println(new SimpleDateFormat("w").format(new Date(data.getYear(), data.getMonth().ordinal(), data.getDayOfMonth())));
            System.out.println("Age:");
            System.out.println(LocalDate.now().getYear() - data.getYear());

        } else {
            System.out.println("Niepoprawny format daty.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Podaj date urodzenia w formacie YYYY-MM-DD:");
        String s = new Scanner(System.in).nextLine();

        dataUrodzenia(s);
    }

}
