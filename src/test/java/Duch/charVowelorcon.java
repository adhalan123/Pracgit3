package Duch;

import java.util.Scanner;

public class charVowelorcon {

    public static void main(String[]args){

        //check given character is vowel or consenta

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter character that you want to check whether it is vowel or consenta");

        char f=sc.next().charAt(0);

        switch(f){
            case 'o':
            case 'O': System.out.println("given character o is the vowel"+ f);
            break;

            case 'i':
            case 'I':  System.out.println("given character i is the vowel"+ f);
            break;


            case 'e':
            case 'E':System.out.println("given character e is the vowel"+ f);
            break;

            case 'a':
            case 'A': System.out.println("given character e is the vowel"+ f);
            break;

            case 'U':
            case 'u': System.out.println("given character u is the vowel"+ f);
            break;


            default: System.out.println("given character is not the vowel"+ f);


        }


    }


}
