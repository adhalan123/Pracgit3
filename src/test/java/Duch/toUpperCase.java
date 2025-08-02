package Duch;

import java.util.Scanner;

public class toUpperCase {

    public static void main(String[]args){

            Scanner sc= new Scanner(System.in);

        System.out.println("please enter a character");

            char a=sc.next().charAt(0);


            if(a>='A'&& a<='Z'){

                char a1= Character.toLowerCase(a);

                System.out.println(a1);



            }

            if(a>='a'&& a<='z'){


                char a2= Character.toUpperCase(a);

                System.out.println(a2);


            }





    }

}
