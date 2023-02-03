package PractisProgramInJava;

public class SwapTwoNumber {
    public static void main(String[] args) {


        int x = 10;
        int y= 20;
        System.out.println("Before swapping "+"x="+x+" y="+y);

      // Logic 1 with use 3rd variable
      /* int t;
        t=x;
        x=y;
        y=t;
        System.out.println("Before swapping "+"x="+x+" y="+y);*/

        //Logic 2 using not 3rd variable
       /* x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Before swapping "+"x="+x+" y="+y);*/

        //Logic 3 Using  multiple and division.
        /*x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("Before swapping "+"x="+x+" y="+y);*/


        //logic 4 using XOR  (^) operator.
       /* x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("After swapping "+"x="+x+" y="+y);*/
        //Logic 5 using single statement
        y=x+y-(x=y);


       System.out.println("After swapping "+"x="+x+" y="+y);



    }
}