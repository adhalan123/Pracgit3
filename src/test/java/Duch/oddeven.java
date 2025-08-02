package Duch;

import java.util.Scanner;

public class oddeven {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Give number to check even odd");

        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("this number is even number"+ a);}

        else{

            System.out.println("given number is odd number");
        }


    }

}
