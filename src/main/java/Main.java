import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        if(a>0){
                System.out.println("양수");
        }
        else if(a==0){
            System.out.println("0");
        }
        else
            System.out.println("음수");
    }
}
