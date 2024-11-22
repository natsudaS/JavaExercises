package exercises;

public class IntegerOperations {
    static int num1=11;
    static int num2=22;
    static int num3=33;
    static int num4=44;
    static int num5=55;
    static int num6=66;
    static int num7=77;
    static int sum;
    public static void main(String[] args) {
        fiveIntSum();
        sixIntSum();
        sevenIntSum();
        fiveIntProd();
    }

    public static void fiveIntSum(){
        sum=num1+num2+num3+num4+num5;
        System.out.println("The sum is: "+sum);
    }

    public static void sixIntSum(){
        sum=num1+num2+num3+num4+num5+num6;
        System.out.println("The sum is: "+sum);
    }

    public static void sevenIntSum(){
        sum=num1+num2+num3+num4+num5+num6+num7;
        System.out.println("The sum is: "+sum);
    }

    public static void fiveIntProd(){
        sum=num1*num2*num3*num4*num5;
        System.out.println("The sum is: "+sum);
    }


}
