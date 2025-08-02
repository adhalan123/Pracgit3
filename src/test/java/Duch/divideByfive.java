package Duch;

import java.util.Scanner;

public class divideByfive {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number for which you want view that is divisible by 5 or not");

        int n=sc.nextInt();

        if(n%5==0){

            System.out.println("Given number is divide by 5="+ n);

        }

        else{

            System.out.println("Given number is not divided by 5="+ n);

        }

    } }
