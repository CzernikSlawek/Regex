package Validator;

import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        System.out.println("Wpisz url");
        String s = new Scanner(System.in).nextLine();

        if(s.matches("https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)")){
            System.out.println("url poprawny");
        }
        else{
            System.out.println("url niepoprawny");
        }
    }

}
