package Duch;

import java.util.Scanner;

public class swapNowithThrdV {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter two numbers");

        double a=sc.nextDouble(); //10

        double b=sc.nextDouble();  //20

        a=a+b; //a=30,b=20

        b=a-b; //b=10;

        a=a-b; //a=20



        System.out.println(a+","+b);



    } }
