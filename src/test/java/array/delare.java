package array;

import java.util.Arrays;

public class delare {

    public static void main(String[]args){

            //delare and initialize array

            int a[]={10,35,23,55};

            int b[]=new int[5];


            System.out.println(a[0]);


            b[0]=34;
            b[1]=45;
            b[2]=56;
            b[3]=85;
            b[4]=867;

            System.out.println(b[0]);

        //find length of both array


        System.out.println(a.length);
        System.out.println(b.length);

        for(int i=0;i<=a.length-1;i++){

            System.out.println(a[i]);

        }
        for(int element:b){

            System.out.println(element);

        }

        //copy array

        //copy one array into another

        int []c=a.clone();

        for(int n:c){

            System.out.println(n);
        }

        Arrays.sort(a);







    }




    }

