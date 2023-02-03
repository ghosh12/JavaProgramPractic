package PractisProgramInJava;

import java.util.LinkedList;
import java.util.List;

public class Link_List_In_Java {
    public static void main(String[] args) {
        List<String> stringLinkList=new LinkedList<>();
        stringLinkList.add("Father");
        stringLinkList.add("mother");
        stringLinkList.add("brother");
       // stringLinkList.remove(2);
        System.out.println(stringLinkList.get(0));
        for (int i=0;i<=stringLinkList.size()-1;i++){
            System.out.println(stringLinkList.get(i));
        }


    }
}
