import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("입력: ");
        int a = s.nextInt();
        int i, j;

        for (i = 1; i < a+1; i++) { // 행 == 가로
            for (j = a; j > 0; j--) { // 열 == 세로
                if(i<j){
                    System.out.print("-");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}





