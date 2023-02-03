package PractisProgramInJava;

import java.util.Arrays;

public class SortInArray {
    public static void main(String[] args) {
        int sortArray[]={5,4,3,2,1};
       Arrays.sort(sortArray);
        for (int i=0; i <=sortArray.length-1;i++){
            System.out.println(sortArray[i]);
        }
    }
}
