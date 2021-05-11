import java.util.Scanner;

public class TwoFloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer the first float : ");
        double x1 = sc.nextDouble();
        System.out.println("entrer the second float : ");
        double x2 = sc.nextDouble();

        if (Math.abs(x1 - x2) < 0.009) {
            System.out.println("the two numbers are the same to two decimal places ");
        } else {
            System.out.println("the two numbers are not the same to two decimal places");
        }
    }

}
