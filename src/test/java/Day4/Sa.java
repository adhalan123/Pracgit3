package Day4;

public class Sa {

    public static void main(String[]args){


        //reverse string

        String s="Hello";

        String d="";

        char[] m=s.toCharArray();

        for(int i=m.length-1;i>=0;i--){

           d=d+m[i];

        }
        System.out.println(d);
    }
}
