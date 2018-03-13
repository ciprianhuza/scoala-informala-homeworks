package GroupJava10;

import java.util.Scanner;

public class Circle {
    private static Scanner sc;

    public static void main(String[] args) {
        double r, Perimeter, Area;
        sc = new Scanner(System.in);

        System.out.println("\n Please Enter Radius of circle: ");
        r = sc.nextDouble();

        Perimeter = 2 * 3.14 * r;
        Area = 3.14 * r * r;


        System.out.format("\n The Perimeter of Circle =", Perimeter);
        System.out.format("\n The Area of triangle = ",Area);
    }
}
