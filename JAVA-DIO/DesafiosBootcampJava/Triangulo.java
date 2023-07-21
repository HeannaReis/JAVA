import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (isTriangle(a, b, c)) {
            double perimeter = calculatePerimeter(a, b, c);
            System.out.printf("Perimetro = %.1f", perimeter);
        } else {
            double area = calculateTrapezoidArea(a, b, c);
            System.out.printf("Area = %.1f", area);
        }
    }

    private static boolean isTriangle(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }

    private static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    private static double calculateTrapezoidArea(double a, double b, double c) {
        return ((a + b) * c) / 2.0;
    }
}