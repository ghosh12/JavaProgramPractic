package PractisProgramInJava;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {
    public static void main (String []args){
        Set<String>stringSet=new HashSet<>();
        stringSet.add("Dipak");
        stringSet.add("Devjoti");
        stringSet.add("Devraaj");
        stringSet.add("moon");
        System.out.println(stringSet);
        System.out.println(stringSet.contains("Dipak"));
        System.out.println(stringSet.isEmpty());

    }
}
