package Duch;

import java.util.Scanner;

public class power {

    public static void main(String[]args){


//find power of given numbers

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter number for which you want print power");

        int n=sc.nextInt();

        System.out.println("please enter power number");

        int p=sc.nextInt();


        int result=1;

        for(int i=1;i<=p;i++){

            result=result*n;


        }

        System.out.println("power of given number "+ n + "is="+ result);


    }



}
