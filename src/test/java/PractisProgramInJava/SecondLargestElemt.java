package PractisProgramInJava;

public class SecondLargestElemt {
    public static void main(String[] args) {
        int a[]={1,4,7,10,20,2};//second largest = 10
        //sort the array = {1,2,4,7,10,20}
        int t;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){ //1 > 4, 1>7,
                    t=a[i];//4
                    a[i]=a[j];//2
                    a[j]=t;//4
                }
            }

        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Second largest Number : "+a[a.length-2]);
    }
}
