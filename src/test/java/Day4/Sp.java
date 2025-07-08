package Day4;

public class Sp {

    public static void main(String[]args){

        String v="AMur";

        String b="";

        for(int i=v.length()-1;i>=0;i--){

          b+=v.charAt(i);

        }

        if(v.equals(b)){

            System.out.println("this is palimdrom string="+b);

        }
        else{

            System.out.println("Given string is not a palimdrom string="+b);
        }



    }
}
