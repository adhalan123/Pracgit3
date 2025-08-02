package Duch;

import java.util.Scanner;

public class markavg {


    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("pleae ener mark of math");

        int math=sc.nextInt();
        System.out.println("please enter mark of science");

        int science=sc.nextInt();

        System.out.println("please enter mark of art");

        int art=sc.nextInt();

        float AVG= (math+science+art)/3;

        System.out.println("the average of all subject is= "+AVG);


    }


}
