package execises;

public class Basics {
    public static void main(String[] args) {
       checkPassFail(10); //try with 0,49,50,51,100
       checkOddEven(-1); //try with 0,1,88,99,-1,-2
       printNumberInWord(2); //try with number 1 to 9
       printDayInWord(5); //try with number 0 to 6
    }

    private static void checkPassFail(int mark) {
        System.out.println("checkPassFail started...\nMark is "+mark);
        if(mark>=50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }

    private static void checkOddEven(int number){
        System.out.println("checkOddEven started...\nNumber is "+number);
        if(number%2!=0){
            System.out.println(number+" is an odd number.");
        }else{
            System.out.println(number+" is an even number.");
        }
        System.out.println("bye");
    }

    private static void printNumberInWord(int number) {
        System.out.println("printNumberInWord started...\nNumber is "+number);
        
        //Using nested if-statement
        System.out.println("if statement...");
        if(number==1){
            System.out.println("ONE");
        }else
        if(number==2){
            System.out.println("TWO");
        }else
        if(number==3){
            System.out.println("THREE");
        }else
        if(number==4){
            System.out.println("FOUR");
        }else
        if(number==5){
            System.out.println("FIVE");
        }else   
        if(number==6){
            System.out.println("SIX");
        }else
        if(number==7){
            System.out.println("SEVEN");
        }else
        if(number==8){
            System.out.println("EIGTH");
        }else
        if(number==9){
            System.out.println("NINE");
        }else{
            System.out.println("OTHER");
        }

        //Using switch-case-default
        System.out.println("switch-case...");
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    private static void printDayInWord(int number) {
        System.out.println("printDayInWord started...\nNumber is "+number);
        
        //Using nested if-statement
        System.out.println("if statement...");
        if(number==0){
            System.out.println("Monday");
        }else
        if(number==1){
            System.out.println("Tuesday");
        }else
        if(number==2){
            System.out.println("Wednesday");
        }else
        if(number==3){
            System.out.println("Thursday");
        }else
        if(number==4){
            System.out.println("Friday");
        }else   
        if(number==5){
            System.out.println("Saturday");
        }else
        if(number==6){
            System.out.println("Sunday");
        }else{
            System.out.println("not a valid day");
        }

        //Using switch-case-default
        System.out.println("switch-case...");
        switch (number) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
