package Day2;

public class New2 {

    public static void main(String[]args){

        int a= 121;

        String h="";
        //check it is palimdrom or not

        String b=String.valueOf(a);

         char[] c =b.toCharArray();

         for(int i=c.length-1;i>=0;i--){

             h+=c[i];

         }
         int l=Integer.parseInt(h);

         if(a==l){

             System.out.println("number is palimdrom number");
         }

         else {

             System.out.println("this is not a palimdrom number");
         }

    }
}
