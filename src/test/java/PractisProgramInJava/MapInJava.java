package PractisProgramInJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInJava {
    public static void main(String[] args) {
        Map<Integer, String> myintStringMap = new HashMap();
        myintStringMap.put(100, "Dipak");
        myintStringMap.put(200, "Devraaj");
        myintStringMap.put(300, "Devjoti");
        myintStringMap.put(400, "moon");
        myintStringMap.put(null, null);
        myintStringMap.put(600,null);
        myintStringMap.put(700,null);
        //myintStringMap.put(null,"deep");
        System.out.println(myintStringMap);
        //System.out.println(myintStringMap.get(200));
        //System.out.println(myintStringMap.size());
        //System.out.println(myintStringMap.entrySet());
        //System.out.println(myintStringMap.get(null));


       /* Map<Integer,String> myHasTable=new Hashtable<>();
        myHasTable.put(10,"Dipak");
        myHasTable.put(20,"Devjoti");
        myHasTable.put(30,"Devraaj");
        myHasTable.put(40,"moon");
        myHasTable.put(60,"rabin");
       // myHasTable.put(null,"ajoy");
        System.out.println(myHasTable);

    }*/
    }
}