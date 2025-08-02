package Duch;

import java.util.Scanner;

public class table {

    public static void main(String[]args){


       //println table to given number  2 4 6 8 10


        Scanner sc= new Scanner(System.in);

        int count=0;

        System.out.println("please enter number for which you want table");

        int n=sc.nextInt();

        for(int i=1;i<=10;i++){

           /* count=count+n;   //0+2 =2  //2+2=4  //4+2=6

            System.out.println(count);*/

            System.out.println(n+"*"+i+"="+(n*i));

        }



    }

}
