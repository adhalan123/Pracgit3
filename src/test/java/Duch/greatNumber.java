package Duch;

import java.util.Scanner;

public class greatNumber {

    public static void main(String[]args){


        Scanner sc= new Scanner(System.in);

        System.out.println("please provide two numbers which need to check which one is great");

        int n1= sc.nextInt();

        int n2=sc.nextInt();

        if(n1>n2){

            System.out.println("n1 is great number "+ n1);

        }

        else{

            System.out.println("n2 is greater number "+ n2);

        }


    }



}
