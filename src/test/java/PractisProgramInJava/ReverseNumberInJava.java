package PractisProgramInJava;

import java.util.Scanner;

public class ReverseNumberInJava {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
       int num=scanner.nextInt();
        /*int reverse=0;
        while (num!=0){
            reverse=reverse*10+num%10;
            num=num /10;

        }*/
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reverce nmber is"+rev);
        //System.out.println("reverse number is :"+reverse);
    }
}
