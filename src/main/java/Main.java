import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, s = 0;
        int a = sc.nextInt();

        for(i = 1; i <= a; i++){
            s+=i;
            if(s>=a){
                break;
            }
        }
        System.out.println(s);
    }
}





