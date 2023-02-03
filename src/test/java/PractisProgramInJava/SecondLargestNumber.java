package PractisProgramInJava;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int largestNumber=0;
        int SecondLargestNumber=0;
        int arr[]={3,6,16,9,15,40};
        for (int i=0;i<=arr.length-1;i++){
            if(arr[i]>largestNumber){
                SecondLargestNumber=largestNumber;
                        largestNumber=arr[i];
            }else if (arr[i]>SecondLargestNumber){
                SecondLargestNumber=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("second largest number "+SecondLargestNumber);
    }
}
