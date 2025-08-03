package array;

import java.util.Arrays;

public class maxnumberarray {

    public static void main(String[]args) {

        int g[] = {45, 76, 94, 24, 23};

        int max=0;
        int min=0;

//find max number from array


        for (int i = 1; i < g.length; i++) {

            if (g[0] < g[i]) {

                g[0] = g[i];

                max=g[0];



            }

            if(g[0]>g[i]){

                g[0]=g[i];

                min=g[0];


            }

        }

        System.out.println("this is max number of araray" + max);
        System.out.println("this is max number of araray" + min);

    }
}
