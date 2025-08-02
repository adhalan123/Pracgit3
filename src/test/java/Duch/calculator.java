package Duch;

import java.util.Scanner;

public class calculator {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("pleae enter two number for operation");

        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("please enter operation symbol");

        char s=sc.next().charAt(0);

        if(s==('+')){

            int result=n1+n2;
            System.out.println("sum of"+ n1+"+"+n2+"is="+ result);

        }


    } }
