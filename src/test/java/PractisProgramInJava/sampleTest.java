package PractisProgramInJava;

import java.util.Arrays;

public class sampleTest {
    public static void main(String[] args) {
        int [] num={90,100,40,30,70};
        //System.out.println(num[0]);
       Arrays.sort(num);
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
           // Arrays.sort(num);
        }
    }
}
