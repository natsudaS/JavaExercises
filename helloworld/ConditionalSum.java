package helloworld;

public class ConditionalSum {
    static int number;
    public static void main(String[] args) {
        oddEvenSum(1,1000);
        threeFiveSevenSum(1,1000);
        printLeapYear(999,2010);
    }

    private static void oddEvenSum(int lowerbound, int upperbound) {
        int sumOdd=0;
        int sumEven=0;
        number=lowerbound;
        while(number<=upperbound){
            if(number%2==0){
                sumEven+=number; //same as sumEven=sumEven+number;
            }else{
                sumOdd+=number;
            }
            number++;
        }
        System.out.println("The sum of odd numbers from "+lowerbound+" to "+upperbound+" is "+sumOdd+"\nThe sum of even numbers from "+lowerbound+" to "+upperbound+" is "+sumEven+"\nThe difference between the two sums is "+(sumEven-sumOdd));
    }

    private static void threeFiveSevenSum(int lowerbound, int upperbound){
        int sum=0;
        number=lowerbound;
        while(number<=upperbound){
            if(number%3==0||number%5==0||number%7==0){
                if(number%15!=0 && number%21!=0 && number%35!=0 && number%105!=0){
                    sum+=number;
                }
            }
            number++;
            //System.out.println(number+"/"+sum);
        }
        System.out.println("The sum is "+sum);
    }

    private static void printLeapYear(int lowerbound, int upperbound){
        System.out.println("printLeapYear started...");
        int sumLY=0; //counter for leap years
        number=lowerbound; //number of the year
        System.out.println("number is set to lowerbound: "+number);
        while(number<=upperbound){
            if(((number%4==0) && (number%100!=0))||(number%400==0)){
                sumLY++;
                System.out.println("AD"+number);
            }
            number++;
        }
        System.out.println("The total count of leap years between "+lowerbound+" and "+upperbound+" is "+sumLY);
    }
}
