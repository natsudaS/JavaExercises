package helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!\n");
        printCheckerPattern();
        printSquarePattern();
        printTriangularPattern();
        printStarPattern();
        printSheepPattern();
    }

    private static void printCheckerPattern(){
        System.out.println("printCheckerPattern");
        System.out.println("* * * * *\n * * * * *\n* * * * *\n * * * * *\n* * * * *\n");
    }

    private static void printSquarePattern(){
        System.out.println("printSquarePattern");
        System.out.println("* * * * *\n*       *\n*       *\n*       *\n* * * * *\n");
    }

    private static void printTriangularPattern(){
        System.out.println("printTriangularPattern");
        System.out.println("* * * * *\n *     *\n  *   *\n   * *\n    *\n");
    }

    private static void printStarPattern(){
        System.out.println("printStarPattern");
        System.out.println("    *    \n* *   * *\n   * *\n  *   *\n *     *\n");
    }

    private static void printSheepPattern(){
        System.out.println("printSheepPattern");
        System.out.println("          '  '\n           -- \n          (oo)\n  /========// \n / || @@ ||   \n*  ||----||   \n   VV    VV   \n   ''    ''   \n");
    }
}