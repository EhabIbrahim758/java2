import java.util.Locale;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner mycahr = new Scanner(System.in);
        System.out.println("enter the character : ");
        String x = mycahr.next().toLowerCase();
        String vowels = "aeoui";
        if ((!Character.isAlphabetic(x.charAt(0)) )|| (x.length()!=1)){
            System.out.println("invalid input");
        }else{
        for (int i = 0; i < vowels.length(); i++) {
            if (x.charAt(0) != vowels.charAt(i)) {

                System.out.println("consonent");
                  break;

            } else {
                System.out.println("Vowel");
                break;

            }
        }
        }
    }
}
