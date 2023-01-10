import java.util.Scanner;

public class Pesel {
    public static void main(String[] args) {
        System.out.println("Wpisz pesel");
        String s = new Scanner(System.in).nextLine();
        if(s.matches("\\d{11}")){
            System.out.println("pesel poprawny");
        }
else{
            System.out.println("pesel niepoprawny");
        }
    }
}
