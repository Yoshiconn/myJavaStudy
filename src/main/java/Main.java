import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] iarr = new int[10];

        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        num -= 1;
        System.out.print(iarr[num]);

    }
}