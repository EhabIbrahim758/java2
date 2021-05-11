
import java.util.Locale;
import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args){
    if (args.length ==1){

        String vowels = "aeoui" ;

        if(vowels.contains(args[0].toLowerCase())){
        System.out.println("Vowel");
        }else{
            System.out.println("consonent");
        }

    }else{
        System.out.println("invalid input");
    }

}
}
