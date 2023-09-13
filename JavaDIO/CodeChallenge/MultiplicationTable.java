import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number to see table");
        int number = scanner.nextInt();
        System.out.println("============================");
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + i * number);

            scanner.close();
        }
    }
}
