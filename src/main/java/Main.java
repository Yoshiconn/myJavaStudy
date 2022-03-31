import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cal1, cal2;

        if (a == 1) {
            cal1 = 400;

        } else if (a == 2) {

            cal1 = 340;
        } else if (a == 3) {

            cal1 = 170;
        } else if (a == 4) {

            cal1 = 100;
        } else {

            cal1 = 70;
        }

        if (b == 1) {

            cal2 = 400;
        } else if (b == 2) {

            cal2 = 340;
        } else if (b == 3) {

            cal2 = 170;
        } else if (b == 4) {

            cal2 = 100;
        } else {

            cal2 = 70;
        }

        if ((cal1 + cal2) > 500) {

            System.out.println("angry");
        } else {

            System.out.println("no angry");
        }


    }
}




