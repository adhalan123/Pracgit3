package Duch;

import java.util.Scanner;



public class leapYear {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a year to check if it is a leap year or not");

        int a = sc.nextInt();

        if ((a % 100 != 0 && a % 4 == 0) || (a % 100 == 0 && a % 400 == 0)) {

            System.out.println("Given year is leave year" + a);


        } else {

            System.out.println("given year is not a leap year" + a);

        }


    }


    }
