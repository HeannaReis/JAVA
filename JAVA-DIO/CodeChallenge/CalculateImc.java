import java.util.Scanner;
    
public class CalculateImc {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Calculete IMC");

    System.out.println("What's your name?");
    String name = scanner.nextLine();

    System.out.println("What's your wheight?");
    Double wheight = scanner.nextDouble();

    System.out.println("What's your height?");
    Double height = scanner.nextDouble();

    Double imc = wheight / Math.pow(height, 2);
    System.out.println("Hello, " + name + "! Your IMC is: " + imc);
    }
}
