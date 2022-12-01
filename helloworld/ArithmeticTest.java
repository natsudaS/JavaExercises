package helloworld;

public class ArithmeticTest {
    public static void main(String[] args) {
        int num1=98;
        int num2=5;
        int num3=77;
        int sum, difference, product, quotient, remainder;

        sum=num1+num2;
        difference=num1-num2;
        product=num1*num2;
        quotient=num1/num2;
        remainder=num1%num2;

        System.out.println("The sum, differnce, product, quotient and remainder of "+num1+" and "+num2+" are: "+sum+", "+difference+", "+product+", "+quotient+", "+remainder+".");

        sum=31*num1+17*num2;

        System.out.println("Sum of 31*"+num1+"+17*"+num2+" equals "+sum);

        num1++; //doesn't matter wether the operators are infront or after the var
        --num2;

        System.out.println("num1 after incremt is: "+num1+"\nnum2 after decrement is "+num2);

        quotient=num1/num2;

        System.out.println("The new quotient of "+num1+" and "+num2+" is "+quotient);

        sum=num1+num2+num3;
        product=num1*num2*num3;

        System.out.println("The sum of "+num1+"+"+num2+"+"+num3+" equals "+sum+".\nThe product of "+num1+"*"+num2+"*"+num3+" equals "+product+".");
    }
}
