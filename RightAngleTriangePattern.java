import java.util.Scanner;

    public class RightAngleTriangePattern {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number or rows : ");
            int rows = sc.nextInt();
            int i, j;
            for (i = 1; i <= rows; i++) {
                for (j = 1; j <= i ; j++) {
                    System.out.print(j);
                }
                System.out.println("");


            }
        }

    }





