package GroupJava10;

import java.util.Scanner;

public class Triangle {
    private static Scanner sc;

    public static void main(String[] args) {
        double a, b, c, Perimeter, Area;
        sc = new Scanner(System.in);

        System.out.println("\n Please Enter Three sides of triangle: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        Perimeter = a + b + c;
        Area = (a+b+c)/2;


        System.out.format("\n The Perimeter of Traiangle = ", Perimeter);

        System.out.format("\n The Area of triangle =",Area);
    }
    public static double AreaOfTriangle(double a, double b, double c){
        double Area;

        return Area;
    }
}
