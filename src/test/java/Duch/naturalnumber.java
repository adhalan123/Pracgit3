package Duch;

import java.util.Scanner;

public class naturalnumber {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int sum=0;

        System.out.println("enter limit upto which you want to print natural numbers");

        int a= sc.nextInt();


        for(int i=1;i<=a;i++){
            sum+=i;
        }
        System.out.println("Sum of all numbers"+ sum);



    }
}
