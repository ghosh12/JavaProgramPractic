
package PractisProgramInJava;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        String string="maa";
        String string1="ma";
        if(string.equals(string1)){
            System.out.println("Both String are equal");
        }else
            System.out.println("Both String are not equal");
       System.out.println( string.charAt(0));
        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Enter your String");
        // String str= scanner.next();
        //String ori_str=str;
        //  String rev="";
        //int len=str.length();
        //for (int i=len-1;i>=0;i--){
        // rev=rev+str.charAt(i);
        //}
        // System.out.println(rev);
        //if(ori_str.equals(rev)){
        // System.out.println("String is palindrom");
        // }else{
        // System.out.println("String is not palindrom");
        // }

        String originString = "MadaM";
        String reverseString = "";
        for (int i = originString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + originString.charAt(i);
        }
        // System.out.println(reverseString);
        if (originString.equals(reverseString)) {
            System.out.println("is palindrom");
        } else {
            System.out.println("is not palindrom");
        }


    }
}




