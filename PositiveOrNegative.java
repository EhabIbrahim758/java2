import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter x1");
        int x = number.nextInt();
        if (x == 0) {
            System.out.println("the input is zero");
        } else if (x > 0) {
            System.out.println("the number is positive");
        } else if (x < 0) {
            System.out.println("the number is negative");
        }


    }
}