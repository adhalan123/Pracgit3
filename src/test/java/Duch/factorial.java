package Duch;

import java.util.Scanner;

public class factorial {

    public static void main(String []args){

//find factorial of given number

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number for which you want factorial");

        int f=sc.nextInt();

// f=5*4*3*2*1

        int result=1;

        for(int i=1;i<=f;i++){

            result=result*i;   //1*1=1  //1*2=2 //2*3=6 //6*4=24 //24*5 =120


        }
        System.out.println(result);



    }

}
