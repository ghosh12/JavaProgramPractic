package PractisProgramInJava;

public class DuplicateAlementArray {
    public static void main(String[] args) {
        //String[] str = {"Dipak", "devjoti", "devraaj", "Dipak"};
        String[]str={"a","b","c","a"};
        boolean isPresent = false;
        //System.out.println(str.length);
        for (int i = 0; i <= str.length-1 ; i++) {
            for (int j =i+1; j <= str.length-1; j++) {
                if (str[i] == str[j] && (i != j)) {
                    System.out.println("found duplicate value  " + str[i]);
                    isPresent = true;

                }
            }
        }
        if (isPresent==false){
            System.out.println("Not found duplicate value");
        }


    }
}