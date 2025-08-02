package Duch;

import java.util.Scanner;

public class voteeleigibility {

    public static void main(String[]args){

        //check vote eligibility

        Scanner sc =new Scanner(System.in);

        System.out.println("please enter your age");

        int age=sc.nextInt();

        int actual_age=(age>=18)? 1:0;

        switch(actual_age){

            case 1:
                System.out.println("you are eligible for voting with age as provided=" + age);
                break;

            case 0:
                System.out.println("you are not eligible with given age=" + age);
                break;

            default:
                System.out.println("not a valid age" + age);
                break;

        }

        /*if(age>=18){

            System.out.println("you are eligible for voting with age as provided="+ age);

        }

        else{

            System.out.println("you are not eligible with given age="+ age);

        }*/


    }

}
