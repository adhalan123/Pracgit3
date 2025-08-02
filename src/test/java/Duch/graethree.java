package Duch;

import java.util.Scanner;

public class graethree {
    public static void main(String[]args){


        Scanner sc= new Scanner(System.in);

        int a,b,c;

        System.out.println("please enter three numbers to which greatenesss amoung them");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("a is greater number="+ a);

        }

        else if(b>=a && b>=c){

            System.out.println("b is greater number="+ b);
        }
        else{

            System.out.println("c is greater number= "+ c);

        }



    }

}
