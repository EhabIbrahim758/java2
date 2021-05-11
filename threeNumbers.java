import java.util.Scanner;

public class threeNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter x1");
        int x1 = number.nextInt();
        System.out.println("enter x2");
        int x2 = number.nextInt();
        System.out.println("enter x3");
        int x3 = number.nextInt();
        if (x1 > x2) {
            if (x1 > x3) {
                System.out.println("the greatest number is " + x1);
            } else  {
                System.out.println("the greatest number is " + x3);
            }
        }else if (x2 > x3) {
            System.out.println("the greatest number is " + x2);
        } else {
            System.out.println("the greatest number is " + x3);
        }
    }


}
