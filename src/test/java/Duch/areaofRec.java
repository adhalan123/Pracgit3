package Duch;

import java.util.Scanner;

public class areaofRec {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of length");

        double l=sc.nextDouble();

        System.out.println("Enter value of height");

        double h=sc.nextDouble();

        double areaOfRec=l*h;

        System.out.println("Area of rectangle is="+ areaOfRec);

    }

}
