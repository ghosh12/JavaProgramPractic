package PractisProgramInJava;

import java.util.Scanner;

public class OddAndEvenNumberwithScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        String evenOdd =(num % 2==0) ? "even":"odd";
        System.out.println(num + " is " +evenOdd);

    }


}
