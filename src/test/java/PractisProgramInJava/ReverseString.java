package PractisProgramInJava;

public class ReverseString {
    public static void main(String[] args) {
      /* String name ="Dipak";
        String reverseString="";
        for (int i= name.length()-1;i>=0; i--){
            reverseString=reverseString+name.charAt(i);
        }
        System.out.println(reverseString);

       */
        String name="Dipak";
        String rev="";
        for (int i =name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}



