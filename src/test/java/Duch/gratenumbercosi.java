package Duch;

import java.util.Scanner;

public class gratenumbercosi {

    public static void main(String[]args){


        Scanner sc= new Scanner(System.in);

        int a,b,c;

        System.out.println("please enter three numbers to which greatenesss amoung them");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int great=a;



        if(b>great){

            great=b;

        }

        if (c>great){

            great=c;

        }


        System.out.println(great);

    }

}
