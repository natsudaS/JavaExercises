package execises;

public class DecisionLoop {
    
    static double sum;
    static double average = 0;
    static final int LOWERBOUND = 1;
    public static void main(String[] args) {
        //calcSumAverageRunningIntWhile(111, 8899);
        //calcSumAverageRunningIntFor(1, 100);
        //calcSumSquares(1,100);
        //calcOddEvenSums(1, 100);
        //calcProduct1toN(13); //up to 12 is possible to store in int, up to 20 is possible to store in long
        //calcHarmonicSum();
        //computePI(1000000);
        //computePIByTerms(1000000);
        //printCozaLozaWozaBoolean(1,110);
        printFibonacci(20);
    }

    private static void calcSumAverageRunningIntWhile(double lowerbound, double upperbound){
        double num = lowerbound;
        int count = 1;
        sum = 0;
        while(num<=upperbound){
            sum += num;
            num++;
            count++;
        }
        average = sum/count-1;
        System.out.println("The sum of "+(int)lowerbound+" to "+(int)upperbound+" is "+(int)sum);
        System.out.println("The average is "+average);
    }

    private static void calcSumAverageRunningIntFor(double lowerbound, double upperbound){
        sum = 0;
        for(double num = lowerbound; num<=upperbound; num++){
            sum += num;
        }
        average = (lowerbound+upperbound)/2;
        System.out.println("The sum of "+(int)lowerbound+" to "+(int)upperbound+" is "+(int)sum);
        System.out.println("The average is "+average);
    }

    private static void calcSumSquares(int lowerbound, int upperbound){
        sum = 0;
        for(int num = lowerbound; num<=upperbound; num++){
           sum += num*num;
        }
        System.out.println("The sum of the squares of "+lowerbound+" to "+upperbound+" is "+(int)sum);
    }

    private static void calcOddEvenSums(int lowerbound, int upperbound){
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff = 0;
        for(int num = lowerbound; num <= upperbound; num++){
            if(num%2==0){
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        if(sumOdd > sumEven){
            absDiff = sumOdd-sumEven;
        } else {
            absDiff = sumEven-sumOdd;
        }
        System.out.println("The sumOdd is: "+sumOdd+"\nThe sumEven is: "+sumEven+"\nThe difference between the sums odd and even is: "+absDiff);
    }

    private static void calcProduct1toN(int upperbound) {
        long product = 1;
        for(int num = LOWERBOUND; num <= upperbound; num++){
            product *= num;
        }
        System.out.println("The product of 1 to "+upperbound+" is "+product);
    }

    private static void calcHarmonicSum(){
        final int MAX_DENOMINATOR = 50000;
        double div;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for(int denominator = 1; denominator<=MAX_DENOMINATOR; denominator++){
            div = 1.0/denominator;
            sumL2R+=div;
        }
        System.out.println(sumL2R);

        for(int denominator = MAX_DENOMINATOR; denominator>=1; denominator--){
            div = 1.0/denominator;
            sumR2L+=div;
        }
        System.out.println(sumR2L);

        if(sumL2R>sumR2L){
            absDiff=sumL2R-sumR2L;
        } else 
        if(sumR2L>sumL2R){
            absDiff=sumR2L-sumL2R;
        } else {
            absDiff=0.0;
        }
        System.out.println(absDiff);
    }

    private static void computePI(int MAX_DENOMINATOR){
        sum = 0;
        for(int denominator = 1; denominator<=MAX_DENOMINATOR; denominator+=2){
            //denominator 1,3,5,7,9 ...
            if(denominator%4==1){
                sum += 1.0/denominator;
            } else
            if(denominator%4==3){
                sum -= 1.0/denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        sum *= 4;

        System.out.println("computed PI: "+sum+"\nMath.PI: "+Math.PI);
    }

    private static void computePIByTerms(int MAX_TERM){
        sum = 0;
        for(int term = 1; term <= MAX_TERM; term++){
            if(term%2 == 1){
                sum += 1.0/(term*2-1);
            } else {
                sum -= 1.0/(term*2-1);
            }
        }
        sum *= 4;

        System.out.println("computed PI: "+sum+"\nMath.PI: "+Math.PI+"\ncomputedPI in % of Math.PI: "+(sum/Math.PI)*100+"%");
    }

    private static void printCozaLozaWoza(int lowerbound, int upperbound){
        for(int num = lowerbound; num <= upperbound; num++){
            if(num%3==0){
                System.out.print("Coza");
            }
            if(num%5==0){
                System.out.print("Loza");
            }
            if(num%7==0){
                System.out.print("Woza");
            }
            if(num%3!=0 && num%5!=0 && num%7!=0){
                System.out.print(num);
            }
            if(num%11==0){
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

    private static void printCozaLozaWozaBoolean(int lowerbound, int upperbound){
        boolean printed;
        for(int num = lowerbound; num <= upperbound; num++){
            printed = false;
            if(num%3==0){
                System.out.print("Coza");
                printed = true;
            }
            if(num%5==0){
                System.out.print("Loza");
                printed = true;
            }
            if(num%7==0){
                System.out.print("Woza");
                printed = true;
            }
            if(!printed){
                System.out.print(num);
            }
            if(num%11==0){
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

    private static void printFibonacci(int length){
        int fn;
        int x = 1;
        int y = 1;
        sum = 2;
        double average;

        System.out.print("The first "+length+" Fibonacci numbers are:\n1 1 ");
        for(int num = 3; num <= length; num++){
            fn = x + y;
            sum += fn;
            System.out.print(fn+" ");
            x = y;
            y = fn;
        }

        average = sum/length;
        System.out.println();
        System.out.println("The average is "+average);
    }

    private static void printTribonacci(int length){
        int fn;
        int x = 0;
        int y = 1;
        int z = 1;
        sum = 2;
        double average;

        System.out.print("The first "+length+" Fibonacci numbers are:\n1 1 ");
        for(int num = 3; num <= length; num++){
            fn = x + y + z;
            sum += fn;
            System.out.print(fn+" ");
            x = y;
            y = fn;
        }

        average = sum/length;
        System.out.println();
        System.out.println("The average is "+average);

    }
}
