package PractisProgramInJava;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        String [] arr={"a","b","c","b"};
        boolean isPresent= false;

        for (int i=0;i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if((arr[i]==arr[j]) && (i != j)){

                    System.out.println("found duplicate element  "+arr[i]);
                    isPresent=true;

                }

            }
        }
        //Check the condition. If the above line of code change the isPresent
        if (isPresent==false){
            System.out.println("Duplicate element not found");

        }
    }

}
