package Duch;

import java.util.Scanner;

public class grate3 {

    public static void main(String[]args) {


        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("please enter three numbers to which greatenesss amoung them");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }

        }

    }
}
