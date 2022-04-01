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

*/