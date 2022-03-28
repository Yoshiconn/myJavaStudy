/*


public class Main {

    public static void main(String[] args) {

        int age = 9;
        int charge = 0;

        if(age < 8){
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        else if(age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if(age < 20) {
            charge = 2500;
            System.out.println("중,고등 학생입니다.");
        }
        else {
            charge = 3000;
            System.out.println("일반인 입니다.");
        }
        System.out.println("입장료는" + charge + "원 입니다.");
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {

        int month = 10;
        int day;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            default:
                day = 0;
                break;
        }
        System.out.println(month + "월은 " + day + "일 까지 있습니다.");
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Main {

    public static void main(String[] args) {

        int num = 1;
        int sum = 0;


        while ( num <= 10) {

            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 "+ sum + "입니다.");
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Main {

    public static void main(String[] args) {

        int num = 1;
        int sum = 0;


        do {
            sum += num;
            num++;
        }while (num < 1);

        System.out.println("1부터 10까지의 합은 "+ sum + "입니다.");
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Main {

    public static void main(String[] args) {

        int dan;
        int times;

        for(dan = 2; dan <= 9; dan++) {

            for (times = 1; times<=9; times++) {
                System.out.println(dan + "X" + times + "=" + dan*times);
            }
            System.out.println();
        }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Main {

    public static void main(String[] args) {

        int dan = 2;
        int times = 1;

        while (dan <= 9) {
            times = 1;
            while ( times <= 9) {
                System.out.println(dan + "X" + times + "=" + dan*times);
                times++;
            }
            dan++;
            System.out.println();
        }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Main {

    public static void main(String[] args) {
        int total = 0;
        int num;

        for(num = 1; num<=100; num++) {

            if( (num % 2) == 1)
                continue;
            total += num;
        }
        System.out.println(total);
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------





* */


