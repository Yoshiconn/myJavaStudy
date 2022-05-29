import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cd = new int[50];

        for(int i = 0; i < n-1; i++){
            cd[i] = sc.nextInt();
        }

        Arrays.sort(cd, 0, n-1);
        for(int i = 0; i < n; i++){

            if(cd[i] != i+1 || cd[i] == 0){
                System.out.println(i+1);
                break;
            }
        }
    }
}

