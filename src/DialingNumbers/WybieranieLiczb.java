package DialingNumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WybieranieLiczb {
    public static void main(String[] args) {
        String numbers = "342\n" +
                 "5.34\n" +
                 "756\n" +
                 "1.234e+07\n" +
                 "7.234243E-02\n" +
                 "6.09\n" +
                 "3457\n" +
                 "87\n" +
                 "1.0001\n" +
                 "3\n" +
                 "5\n" ;
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(numbers);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
