import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for (int i = 0; i < num; i++) {
            int n = entrada.nextInt();
            int n2 = entrada.nextInt();

            System.out.println(n+n2);

        }

    }
}