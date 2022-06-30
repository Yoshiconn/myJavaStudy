import java.util.Arrays;
import java.util.Scanner;

public class ex_0701 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num[] = s.nextLine().trim().split(" ");
        Arrays.sort(num);
        for (String str : num) System.out.print(str + " ");
    }
}