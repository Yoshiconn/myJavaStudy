/*  틀렸던 문제들은 첫 문장 앞에 false 표시

(false) import java.util.Scanner; // 스캐너 클래스 호출

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner 라는 객체를 생성한다.
        char input = sc.next().charAt(0); // 문자 하나만 받을수 있는 char 변수 "input" 를 만든뒤 입력받는다.

        System.out.println(input); // input 이라는 char 형 변수 값을 출력한다.
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner; // 스캐너 클래스 호출

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner 라는 객체를 생성한다.

        int a, b; // int 라는 이름의 정수를 담는 변수 a와 b를 생성
        a = sc.nextInt(); // 정수 값을 입력 받고 a에 저장
        b = sc.nextInt(); // 정수 값을 입력 받고 b에 저장
        sc.close(); // 스캐너 사용후 꼭 닫아주기

        System.out.printf("%d %d", a, b); // 입력 받은 값인 a 와 b 를 출력
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------

(false) import java.util.Scanner; // 스캐너 클래스 호출

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner 라는 객체를 생성한다.

        char x = sc.next().charAt(0); // 문자 하나를 입력받는 x 라는 char 변수 를 생성한다.
        char y = sc.next().charAt(0); // 문자 하나를 입력받는 y 라는 char 변수 를 생성한다.

        sc.close(); // 스캐너 사용후 꼭 닫아주기

        System.out.printf("%c %c", y, x); // 입력받은 char 형 변수 y와 x를 출력한다.
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------

(false) import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a;
        a = sc.next();

        sc.close(); // 스캐너 사용후 꼭 닫아주기

        System.out.printf("%s", a);
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------

(false) import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        sc.close(); // 스캐너 사용후 꼭 닫아주기

        System.out.printf("%s", s);
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

------------------------------------------------------------------------------------------------------------------------------------------

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

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cal1, cal2;

        if (a == 1) {
            cal1 = 400;

        } else if (a == 2) {

            cal1 = 340;
        } else if (a == 3) {

            cal1 = 170;
        } else if (a == 4) {

            cal1 = 100;
        } else {

            cal1 = 70;
        }

        if (b == 1) {

            cal2 = 400;
        } else if (b == 2) {

            cal2 = 340;
        } else if (b == 3) {

            cal2 = 170;
        } else if (b == 4) {

            cal2 = 100;
        } else {

            cal2 = 70;
        }

        if ((cal1 + cal2) > 500) {

            System.out.println("angry");
        } else {

            System.out.println("no angry");
        }


    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


*/
//import java.util.Scanner;
//
//public class Main {
//
//    static String underline = "";
//
//    public static void rec(int N) {
//
//        String line = underline;
//
//        if (N == 0) {
//            System.out.println(line + "\"재귀함수가 뭔가요?\"");
//            System.out.println(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
//            System.out.println(line + "\"라고 답변하였지.\"");
//            return;
//        }
//        System.out.println(line + "\"재귀함수가 뭔가요?\"");
//        System.out.println(line + "\"잘들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\"");
//        System.out.println(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
//        System.out.println(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
//
//        underline += "___";
//
//        rec(N-1);
//
//        System.out.println(line + "라고 답변하였지.");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//        rec(N);
//    }
//}