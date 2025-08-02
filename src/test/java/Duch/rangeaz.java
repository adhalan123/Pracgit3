package Duch;

import java.util.Scanner;

public class rangeaz {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter character to println its range");

        char v=sc.next().charAt(0);

        for(char n=v; n<='z'; n++){


            System.out.println(n);


        }


    }

}
