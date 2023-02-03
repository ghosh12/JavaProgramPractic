package PractisProgramInJava;

public class SumDouble {
    public static int sumDouble(int a, int b) {
        int sum =a+b;
        if(a==b){
            sum=sum*2;
        }

        return sum;

    }

    public static void main(String[] args) {
       System.out.println(sumDouble(8,8));
    }

}
