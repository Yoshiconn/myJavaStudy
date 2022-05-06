import java.util.Scanner;

public class back {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] b = a.toCharArray();
        System.out.print("welcome! ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}
