package PractisProgramInJava;

public class ReverseNumberJava2 {
   public static int revNum(int n) {
       int rev = 0;
       int rem;
       while (n > 0) {
           rem = n % 10;
           rev = (rev * 10) + rem;
           n = n / 10;
       }
       return rev;
   }
    public static void main(String[] args) {
        int n = 8791;
        System.out.println("reverce number"+revNum(n));

    }
}
