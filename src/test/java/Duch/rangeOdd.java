package Duch;

import java.util.Scanner;

public class rangeOdd {
    public static void main(String[]args){


        Scanner sc= new Scanner(System.in);

        System.out.println("give range for println odd numbers");

        int a=sc.nextInt();

        for(int i=1;i<=a;i++){


            if(i%2!=0){

                System.out.println(i);
            }


        }



    }





}
