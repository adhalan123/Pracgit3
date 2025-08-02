package Duch;

import java.util.Scanner;

public class factor1 {
    public static void main(String[]args){


            Scanner sc= new Scanner(System.in);

            System.out.println("Enter number");

      // 12 =  12 6 4 2 1

            int n=sc.nextInt();

            for(int i=1;i<=n;i++){

                if(n%i==0){

                    System.out.print(i + " ");
                }
            }


        }
    }
