package PractisProgramInJava;

public class Test {
    public static void main(String[] args) {
        String str = "madam";
        boolean flag = true;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("String "+str+" is palindrome");
        }
        else
            System.out.println("String "+str+" is not palindrome");

    }


}



