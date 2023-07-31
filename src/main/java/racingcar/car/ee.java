package racingcar.car;

import java.util.Scanner;

public class ee {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] d = scan.nextLine().split(" ");
        int a = 0;
        int b = 0;
        int c = 0;
        a = Integer.parseInt(d[0]);
        b = Integer.parseInt(d[1]);
        c = scan.nextInt();
        b = b + c;
        if(b>=60) {
            b = b%60;
            a = a+(b/60);
            System.out.println(a);
            System.out.println(b);
        }
        if(a>=24) {
            a = a%24;
        }
        System.out.println(a + " " + b);
    }

}
