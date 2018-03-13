package GroupJava10;

import java.util.Scanner;

public class Square {
    private static Scanner sc;

    public static void main(String[] args) {
        double a,Perimeter, Area;
        sc = new Scanner(System.in);

        System.out.println("\n Please enter the side of square ");
        a = sc.nextDouble();
        Perimeter = a+a+a+a;
        Area = a * a;

        System.out.format("\n The Perimeter of Traiangle = %.2f\n", Perimeter);
        System.out.format("\n The Area of triangle = %.2f\n",Area);
    }
    public static double Square(double a, double Perimeter, double Area){
        return Area;
    }
}
