public class GetMaxNumber {
    public static void main(String[] args) {
        System.out.println(Math.min(10, 50));
        System.out.println(Math.max(30, 40));
        System.out.println(Math.abs(-17));
        System.out.println(Math.absExact(20));
        // System.out.println(getMax(20,30,100));

    }

    /* public static int getMax(int num1,int num2,int num3){
         int result;
         if (num1>=num2 && num1>=num3){
             result=num1;
         }
         else if (num2>=num1 && num2>=num3){

             result=num2;
         }else {
             result=num3;
         }
           return result;
     }*/
    public String alarmClock(int day, boolean vacation) {
        if(vacation){
            if(day>0 && day!=6)
                return "10:00";
            else  return "off";
        }
        else if(day>0 && day!=6)
            return "7:00";
        else return "10:00";

    }
    public boolean more20(int n) {

        return (n % 20) == 1 || (n % 20) == 2;
    }




}
