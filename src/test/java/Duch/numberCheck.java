package Duch;

import java.util.Scanner;



public class numberCheck {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter a number");

        double a=sc.nextDouble();

        if(a>0){

            System.out.println("Given number is positive ="+a);

        }

        if(a<0){

            System.out.println("Given number is negative ="+a);

        }
        if(a==0){

            System.out.println("Given number is zero ="+a);

        }





    }

}
