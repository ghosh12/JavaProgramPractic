package PractisProgramInJava;

public class ReverseStringInJava2 {
    public static void main (String[] args){
        //String reverse="Bangladesh";
        //Using toCharArray and for loop
       /* char [] resultArray=reverse.toCharArray();
        for (int i=resultArray.length-1;i>=0;i--){
            System.out.print(resultArray[i]);
        }*/

        //Using StringBuilder class
        /*String input= "Bangladesh";
        StringBuilder sb=new StringBuilder();
        sb.append(input);
        sb.reverse();
        System.out.println("Reverse string "+sb);*/

        //Using StringBuffer class
        String input="Bangladesh";
        StringBuffer stringBuffer=new StringBuffer(input);
        stringBuffer.reverse();
        System.out.println("Reverse string"+stringBuffer);


    }




}
