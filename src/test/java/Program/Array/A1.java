package Program.Array;

public class A1 {
     public static void main(String[]args){

      int a[]={12,56,76,98};

      //find the largest element from array

      int max=a[0];

      for(int i=1;i< a.length;i++){

          if(a[i]>max){

              max=a[i];

          }

      }

         System.out.println(max);


     }
}
