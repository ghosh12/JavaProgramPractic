package PractisProgramInJava;

import java.util.*;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String st="i am am dipak dipak";
        String[]arr = st.split(" ");

        for(int i=0; i< arr.length; i++){
            System.out.print(" " + arr[i]);
        }

        System.out.println("\n---------------------");

        Set<String> mySet= new LinkedHashSet<>() ;

        //adding arr element
        for (String element :arr){
            mySet.add(element);
        }


        //Now is time to print all the elements available
        Iterator itr=mySet.iterator();
       // while (itr.hasDupNext()){
            System.out.println(itr.next());
        }

   // }

    public static void rem(String s){
       // for(int i=0;i<s.)


    }
}
