import java.util.Arrays;
import java.util.Scanner;

public class working {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num[] = sc.nextLine().trim().split(" ");
        Arrays.sort(num);
        for (String str : num) System.out.print(str + " ");
    }
}