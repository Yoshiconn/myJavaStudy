import java.util.Scanner;

public class back {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] b = a.toCharArray();
        if (b.length > 10) {
            System.out.println("이름은 10자리를 넘을수 없습니다. \n");
        } else {
            System.out.print("welcome! ");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]);
                {
                    sc.close();
                }
            }
        }
    }
}
