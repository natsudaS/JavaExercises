package execises;

import java.util.ArrayList;

public class DataRep {
    public static void main(String[] args) {
        //notes

        /*//decimal (Base 10), optionally denote with suffix D
        System.out.println("decimal\n735D = 700+30+5 = 7*10^2+30*10^1+5x10^0");
        //binary (Base 2), B for bits, 8bits=1byte(8=2³), prefix 0b/0B or b'...'
            //0,1
        System.out.println("binary\n10110B = 10000B+0000B+100B+10B+0B = 1*2^4+0*2^3+1*2^2+1*2^1+0*2^0");
        //hexadecimal (Base 16), suffix H, prefix 0x/0X or x'...'
            //0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
        System.out.println("hexadecimal\nA3EH = A00H+30H+EH = 10*16^2+3*16^1+14*16^0");
        /*0   ,1   ,2   ,3   ,4   ,5   ,6   ,7   ,8   ,9   ,A   ,B   ,C   ,D   ,E   ,F
         *0000,0001,0010,0011,0100,0101,0110,0111,1000,1001,1010,1011,1100,1101,1110,1111
         *0   ,1   ,2   ,3   ,4   ,5   ,6   ,7   ,8   ,9   ,10  ,11  ,12  ,13  ,14  ,15 
         *//* 
        System.out.println("hex to binary\n\tA3C5H = 1010 0011 1100 0101B\n\t102AH = 0001 0000 0010 1010B");
        System.out.println("binary to hex\n\t1001001010B = 0010 0100 1010B = 24AH\n\t10001011001011B = 0010 0010 1100 1011B = 22CBH"); //hex num sys provides short form for binary bits
        System.out.println("base r to decimal\ne.g.\tA1C2H = 10*16^3 + 1*16^2 + 12*16^1 + 2*16^0 = 41410\n\t10110B = 1*2^4 + 0*2^3 + 1*2^2 + 1*2^1 + 0*2^0 = 22");
        System.out.println("decimal to base r\n\tconvert 261(base10) to hex:\n\t\t261/16 => 16 R:5, 16/16 => 1 R:0, 1/16 => 0 R:1 (quotient 0 stop), 261D = 105H (collect hex digits from R in reverse order)\n\tto convert 1023(base4) to base3\n\t1023(base4)=>75D\n\t\t75D/3 => 25 R:0, 25/3 => 8 R:1, 8/3 => 2 R:2, 2/3 => 0 R:2, 1023(base4) = 2210(base3)");
        System.out.println("conversion with fractional part\ndecimal to binary (18,6875D to binary):\n\t18D/2 => 9 R:0 .... 18D = 10010B\nfractinal part (,6875D):\n\t,6875*2 => 1.375 => 1, ,375*2 => 0.75 => 0, ,75*2 => 1.5 => 1, ,5*2 => 1,0 => 1, ,6875D = ,1011B\ncombine: 18,6875D = 10010.1011B");
        */

        System.out.println("dec to bin: 108D -> "+decimalToBinary(108));
        System.out.println("dec to bin: 4848D -> "+decimalToBinary(4848));
        System.out.println("dec to bin: 9000D -> "+decimalToBinary(9000));
       
        System.out.println("dec to hex: 108D -> "+decimalToHex(108));
        System.out.println("dec to hex: 4848D -> "+decimalToHex(4848));
        System.out.println("dec to hex: 9000D -> "+decimalToHex(9000));
        
        System.out.println("bin to dec: 1000011000B -> "+binaryToDecimal("1000011000"));
        System.out.println("bin to dec: 10000000B -> "+binaryToDecimal("10000000"));
        System.out.println("bin to dec: 1010101010B -> "+binaryToDecimal("101010101010"));

        System.out.println("bin to hex: 1000011000B -> "+binaryToHex("1000011000"));
        System.out.println("bin to hex: 10000000B -> "+binaryToHex("10000000"));
        System.out.println("bin to hex: 1010101010B -> "+binaryToHex("101010101010"));

        System.out.println("hex to dec: ABCDEH -> "+hexToDecimal("ABCDE"));
        System.out.println("hex to dec: 1234H -> "+hexToDecimal("1234"));
        System.out.println("hex to dec: 80FH -> "+hexToDecimal("80F"));
        
        System.out.println("hex to bin: ABCDEH -> "+hexToBinary("ABCDE"));
        System.out.println("hex to dec: 1234H -> "+hexToBinary("1234"));
        System.out.println("hex to dec: 80FH -> "+hexToBinary("80F"));
    }

    private static String decimalToBinary(int decimalNum){
        ArrayList<Integer> bits = new ArrayList<>();
        int quotient = decimalNum;
        int remainder;
        StringBuilder erg = new StringBuilder();
        String binaryNumStr;

        while(quotient != 0){
            remainder= quotient%2;
            //System.out.println(quotient);
            bits.add(remainder);
            quotient= quotient/2; 
        }

        for(int i = bits.size()-1; i>=0; i--){
            erg.append(bits.get(i));
        }

        binaryNumStr = erg.toString();
        binaryNumStr += "B";

        return binaryNumStr;
    }

    private static String decimalToHex(int decimalNum){
        ArrayList<Integer> hexIndex = new ArrayList<>();
        int quotient = decimalNum;
        int remainder;
        String hexNumStr = "";

        while(quotient != 0){
            remainder= quotient%16;
            hexIndex.add(remainder);
            quotient= quotient/16; 
        }

        for(int i = hexIndex.size()-1; i>=0; i--){
            int number = hexIndex.get(i);
            switch (number){
                case 10:
                    hexNumStr += "A"; break;
                case 11:
                    hexNumStr += "B"; break;
                case 12:
                    hexNumStr += "C"; break;
                case 13:
                    hexNumStr += "D"; break;
                case 14:
                    hexNumStr += "E"; break;
                case 15:
                    hexNumStr += "F"; break;
                default:
                    hexNumStr += number; break;
                }
        }
        hexNumStr +="H";

        return hexNumStr;
    }

    private static String binaryToDecimal(String binaryNumStr){
        ArrayList<Integer> bits = new ArrayList<>();
        String binary = binaryNumStr;
        String decimalNumStr;
        double decimal = 0;
        int pow;
        int sI = 0;
        int eI = 1;
        //System.out.println("Num: "+binary+"\nlength: "+binary.length());
        if(binary.length()%4!=0){
            int remainder = binary.length()%4;
            //System.out.println("R: "+remainder);
            for(int i = 0; i<remainder;i++){
                //System.out.println(binary);
                binary = "0" + binary;
                //System.out.println(binary);
            }
        }
        //System.out.println("new num: "+binary+"\nnew length: "+binary.length());
        pow = binary.length()-1;
        for(int i=0;i<binary.length();i++){
            bits.add(Integer.parseInt(binary.substring(sI,eI)));
            sI++; eI++;
        }
        for(int i=0; i<bits.size(); i++){
            if(bits.get(i)==1){
                decimal += Math.pow(2, pow);
                //System.out.println("pow: "+pow+"\ndecimal: "+decimal);
            }
            pow--;
        }
        
        decimalNumStr = Double.toString(decimal);

        return decimalNumStr;
    }
    
    private static String binaryToHex(String binNumStr){
        String hexNumStr;
        String decNumStr;
        int decNum;
        decNumStr = binaryToDecimal(binNumStr);
        decNum = Integer.parseInt(decNumStr.substring(0,decNumStr.length()-2));
        hexNumStr = decimalToHex(decNum);

        return hexNumStr;
    }

    private static String hexToDecimal(String hexNumStr) {
        ArrayList<String> hexDigits = new ArrayList<>();
        String hexadec = hexNumStr;
        String decNumStr;
        String hexDigit;
        int pow;
        int decNum = 0;
        int sI = 0;
        int eI = 1;
        for(int i=0; i<hexadec.length(); i++){
            hexDigits.add(hexadec.substring(sI,eI));
            //System.out.println(hexadec.substring(sI,eI));
            sI++;
            eI++;
        }
        pow = hexDigits.size()-1;
        for(int j=0; j<hexDigits.size(); j++){
            hexDigit = hexDigits.get(j);
            //System.out.println(hexDigit+"/"+pow);
            switch(hexDigit){
                case "A":
                    decNum += 10*Math.pow(16, pow); break;
                case "B":
                    decNum += 11*Math.pow(16, pow); break;
                case "C":
                    decNum += 12*Math.pow(16, pow); break;
                case "D":
                    decNum += 13*Math.pow(16, pow); break;
                case "E":
                    decNum += 14*Math.pow(16, pow); break;
                case "F":
                    decNum += 15*Math.pow(16, pow); break;
                default:
                    decNum += Integer.parseInt(hexDigit)*Math.pow(16, pow); break;
            }
            pow--;
        }
        
        decNumStr = Integer.toString(decNum)+"D";

        return decNumStr;
    }
    
    private static String hexToBinary(String hexNumStr) {
        String binNumStr;
        String decNumStr = hexToDecimal(hexNumStr);
        int decNum = Integer.parseInt(decNumStr.substring(0,decNumStr.length()-1));
        binNumStr = decimalToBinary(decNum);
        
        return binNumStr;
    }
    
}
