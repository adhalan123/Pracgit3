package Duch;

import java.util.Scanner;

public class sumoddeven {

    public static void main(String[]args){


        //print sum of even number from give range

        Scanner sc= new Scanner(System.in);

        int sum=0;

        System.out.println("Give range number to print its even number sum");

        int a=sc.nextInt();

        for(int i=0;i<=a;i++){

            if(i%2==0){

                sum+=i;
            }

        }

        System.out.println("Sum of even number from given range= "+sum);

    }







}
