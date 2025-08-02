package Duch;

import java.util.Scanner;

public class ascii {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter character to check ASCII value of that character");

        char h=sc.next().charAt(0);

        int v=h;

        System.out.println("ASCII value of "+h+" is= "+ v);



    }


}
