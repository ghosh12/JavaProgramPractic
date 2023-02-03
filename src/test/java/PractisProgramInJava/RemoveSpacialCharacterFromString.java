package PractisProgramInJava;

public class RemoveSpacialCharacterFromString {
    public static void main(String[] args) {
        String s1="Testing@@@@*@@@@@@$$%%%&&**??....%%$###@!&*&^%$#@!!!@#*#$%%^^ Selenium java 000123 ";
       s1= s1.replaceAll("[^a-zA-Z1-9]","");
        System.out.println(s1);
    }
}


