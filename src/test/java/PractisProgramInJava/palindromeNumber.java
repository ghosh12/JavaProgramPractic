package PractisProgramInJava;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scanner.nextInt();
        int org_number=num;
         int reverseNumber=0;
         while (num !=0){
                reverseNumber=reverseNumber*10 + num % 10;  // 0*10+2  = 2, 2*10+2131%
                num = num/10; // 21312 / 10 = 2131, 2131/10 = 213, 213/10=21, 21/10=2, 2/10=0; and stop
         }
         if (org_number == reverseNumber){
             System.out.println(org_number+"  palindrom number");
         }else
             System.out.println(org_number+"  Not palindrom number");
    }
}
