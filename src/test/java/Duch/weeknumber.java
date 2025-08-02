package Duch;

import java.util.Scanner;

public class weeknumber {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number between 0 to 6 and it will return you day of week");


        int n=sc.nextInt();

        switch(n){

            case 0: System.out.println("Monday");
                break;

            case 1: System.out.println("tuesday");
                break;

            case 2: System.out.println("wednsaday");
                break;

            case 3: System.out.println("thursday");
                break;

            case 4: System.out.println("friday");
                break;

            case 5: System.out.println("saturday");
                break;

            case 6: System.out.println("sunday");
                break;

            default: System.out.println("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday");

        }




    }
}
