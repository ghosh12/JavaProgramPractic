package PractisProgramInJava;

import java.util.HashSet;
import java.util.Set;

public class Set_in_Java {
    public static void main(String[]arg){
        Set<Integer> hasSet=new HashSet<>();//No duplicate value
        hasSet.add(20);                     //No insertion order
        hasSet.add(30);
        hasSet.add(40);
        hasSet.add(40);
        hasSet.add(100);
        for (int Element:hasSet){
           System.out.println(Element);
        }
    }
}
