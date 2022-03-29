import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int result = a+b+c+d;

        if (result==4) {
            System.out.println("윷");
        }
        else if (result==3){
            System.out.println("걸");
        }
        else if (result==2){
            System.out.println("개");
        }
        else if (result==1){
            System.out.println("도");
        }
        else if (result==0){
            System.out.println("모");
        }
        else {
            System.out.println("값을 잘못 입력 하였습니다.");
        }
    }
}



