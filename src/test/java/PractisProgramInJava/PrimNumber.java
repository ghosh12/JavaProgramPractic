package PractisProgramInJava;

import java.util.ArrayList;
import java.util.List;

public class PrimNumber {
   /** public static void main(String[] args) {
        List<Integer> primNumbers = new ArrayList<>();
        for( int numberTocheck=2;numberTocheck<=100; numberTocheck++){
            boolean isprime= true;
            for (int factor =2; factor<=numberTocheck/2;factor++){
                if(numberTocheck%factor==0){
                    isprime =false;
                    break;

                }
            }
            if (isprime){
                primNumbers.add(numberTocheck);
            }
        }
        System.out.println("prim number is 1 to 100");
        for (int number : primNumbers){
            System.out.println(number);
        }
    }**/
   public static void main(String [] args){
       List<Integer> primNum=new ArrayList<>();
       for (int i =2;i <=50;i++){
           boolean isprim=true;
           for (int j=2;j<=i/2;j++){
               if(i%j==0){
                   isprim=false;
                   break;
               }

           }
           if (isprim){
               primNum.add(i);
           }
       }
       System.out.println("prim number is 1 to 100");
       for (int number :primNum){
           System.out.println(number);
       }
}
}