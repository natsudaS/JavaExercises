package helloworld;

public class WhileSum {
    static int number;
    static int sum;
    static int product;
    public static void main(String[] args) {
        runningNumberSum(1,1000);
        runningNumberSum(9,899);
        runningNumberOddSum(1,1000);
        runningNumberMod7Sum(1, 1000);
        runningNumberSquareSum(1,100);
        runningNumberProduct(1,10);
    }

    private static void runningNumberSum(int lowerbound, int upperbound) {
        number=lowerbound;
        sum=0;
        while(number<=upperbound){
            sum=sum+number;
            number++;
        }
        System.out.println("The sum from "+lowerbound+" to "+upperbound+" is "+sum);
    }

    private static void runningNumberOddSum(int lowerbound, int upperbound) {
        number=lowerbound;
        sum=0;
        while(number<=upperbound){
            sum=sum+number;
            number=number+2;
        }
        System.out.println("The sum from "+lowerbound+" to "+upperbound+" is "+sum);
    }

    private static void runningNumberMod7Sum(int lowerbound, int upperbound) {
        number=7;
        sum=0;
        while(number<=upperbound){
            sum=sum+number;
            number=number+7;
        }
        System.out.println("The sum from "+lowerbound+" to "+upperbound+" is "+sum);
    }

    private static void runningNumberSquareSum(int lowerbound, int upperbound) {
        number=lowerbound;
        sum=0;
        while(number<=upperbound){
            sum=sum+number*number;
            number++;
        }
        System.out.println("The sum from "+lowerbound+" to "+upperbound+" is "+sum);
    }

    private static void runningNumberProduct(int lowerbound, int upperbound) {
        number=lowerbound;
        product=1;
        while(number<=upperbound){
            product=product*number;
            number++;
        }
        System.out.println("The product from "+lowerbound+" to "+upperbound+" is "+product);
    }
}
