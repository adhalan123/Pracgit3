package Duch;

import java.util.Scanner;

public class cal {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("please enter first numbers");
        int a=sc.nextInt();
        System.out.println("please enter 2nd numbers");
        int b=sc.nextInt();
        System.out.println("Give operation name");
        String op= sc.next();
        if(op.equals("Sum")){
            System.out.println("Sum of a and b is= "+ (a+b));
        }
        else{System.out.println("Sum of a and b is= "+ (a*b));}



    }

}
