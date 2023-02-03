package PractisProgramInJava;

public class SwapTwoString {
    public static void main(String[] args) {
        String s1 ="hello";
        String s2 ="world";
        String s =s1+s2;
//beafore swaping
        System.out.println(s1);
        System.out.println(s2);
        //After swaping
        s2=s.substring(0,s.length()-s2.length());
        s1= s.substring(s2.length());

        System.out.println(s1);
        System.out.println(s2);


    }
}
