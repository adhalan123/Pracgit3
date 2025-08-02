package Duch;

import java.util.Scanner;

public class digitofnum {

    public static void main(String[]args){

        //find number of digit in given number

        Scanner sc= new Scanner(System.in);

        long count=0;

        System.out.println("please enter number");

        long n= sc.nextInt();

        while(n>0){

            n=n/10;

            count++;
        }

        System.out.println("number of digit in given number=" + count);

    }

}
