import java.util.Scanner; // 스캐너 클래스 호출

public class Codeup {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner 라는 객체를 생성한다.
        char input = sc.next().charAt(0); // 문자 하나만 받을수 있는 char 변수 "input" 를 만든뒤 입력받는다.

        System.out.println(input); // input 이라는 char 형 변수 값을 출력한다.
    }
}

