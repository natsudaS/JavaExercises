package helloworld;

public class Computations {
    static final double PI=3.14159265;

    public static void main(String[] args) {
        computeCircle();
        computeRectangle();
        computeCylinder();
    }

    private static void computeCircle() {
        double radius, area, circumference;

        radius=1.2;

        area=radius*radius*PI;
        circumference=2.0*radius*PI;

        System.out.println("computeCircle()...\nThe radius is: "+radius+"\nThe area is: "+area+"\nThe circumference is: "+circumference+"\n");
    }

    private static void computeRectangle() {
        double height, width, area, perimeter;

        height=4.5;
        width=2.3;

        area=height*width;
        perimeter=2.0*height+2.0*width;

        System.out.println("computeRectangle()...\nThe height is: "+height+"\nThe width is: "+width+"\nThe area is: "+area+"\nThe perimeter is: "+perimeter+"\n");
    }

    private static void computeCylinder() {
        double radius, height, surfaceArea, baseArea, volume;

        radius=1.2;
        height=5.2;

        baseArea=radius*radius*PI;
        surfaceArea=height*2.0*radius*PI;
        volume=baseArea*height;

        System.out.println("computeCylinder()...\nThe radius is: "+radius+"\nThe baseArea is: "+baseArea+"\nThe surfaceArea is: "+surfaceArea+"\nThe Volume is: "+volume+"\n");
    }
}
