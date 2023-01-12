package Password;

import java.time.LocalDate;
import java.util.Scanner;

public class Haslo {
    static boolean sprawdzHaslo(String haslo) {
        if (haslo.length() < 7) {
            return false;
        } else if (haslo.contains(Integer.toString(LocalDate.now().getYear())) || haslo.contains(Integer.toString(LocalDate.now().getYear()).substring(2))) {
            return false;
        } else {
            boolean duza = false;
            boolean cyfra = false;

            for (char c : haslo.toCharArray()) {
                int k = (int) c;

                if (k >= 65 && k <= 90) {
                    duza = true;
                }

                if (k >= 48 && k <= 57) {
                    cyfra = true;
                }


            }

            return duza && cyfra;
        }
    }

    public static void main(String[] args) {
        System.out.println("Wpisz haslo");
        String s = new Scanner(System.in).nextLine();

        if (sprawdzHaslo(s)) {
            System.out.println("haslo poprawne");
        } else {
            System.out.println("haslo niepoprawne");
        }

    }
}
