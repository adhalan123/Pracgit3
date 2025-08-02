package Duch;

import java.util.Scanner;

public class evenrange {

    public static void main(String[]args){


        //print even number in given range


        Scanner sc= new Scanner(System.in);

        System.out.println("Give number to println even numbers from given range");

        int A= sc.nextInt();


        for(int i=0;i<=A;i++){

            if(i%2==0){

                System.out.println(i);


            }

        }


    }


}
