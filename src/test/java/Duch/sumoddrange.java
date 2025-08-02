package Duch;

import java.util.Scanner;

public class sumoddrange {
    public static void main(String[]args){


//print sum of odd numbers from given range given by user

        Scanner sc= new Scanner(System.in);

        int sum=0;

        System.out.println("give number to print sum of odd number from given range ");

        int s=sc.nextInt();

        for(int i=0;i<=s;i++){

            if(i%2!=0){

                sum+=i;
            }

        }

        System.out.println("sum of odd numbers from given range="+ sum);

    }


}
