package Duch;

import java.util.Scanner;

public class salary {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter your salary");

        double s = sc.nextInt();

        if (s < 10000) {

            System.out.println("no tax on salary less than 10000 $ and your salary is =" + s);

        } else if (s > 10000 && s < 100000) {

           double tax1 = s * 0.1;

            System.out.println("tax on your salary is= " + tax1);


        } else if (s > 100000) {

            double tax2 = s * 0.2;

            System.out.println("tax on your salary is= " + tax2);


        }


    }}
