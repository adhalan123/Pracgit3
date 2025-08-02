package Duch;

import java.util.Scanner;

public class swanNo_thrdV {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter two numbers");

        double a=sc.nextDouble(); //10

        double b=sc.nextDouble();  //20

        double c;


        c=b;  //c=20

        b=a;  //b=10

        a=c;  //a=20

        System.out.println(a + ","+ b);

    } }
