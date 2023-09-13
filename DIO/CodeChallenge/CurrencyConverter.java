import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. Dollar to Real");
        System.out.println("2. Real to Dollar");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double dollarToRealExchangeRate = 4.80;
        double realToDollarExchangeRate = 1.0 / dollarToRealExchangeRate;

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#,##0.00", symbols);

        scanner.useLocale(Locale.US); // Definindo o separador decimal para ponto (.)
        
        if (choice == 1) {
            System.out.print("Enter the amount in Dollars: $");
            double amountInDollars = scanner.nextDouble();
            double convertedAmount = amountInDollars * dollarToRealExchangeRate;
            System.out.println("Converted amount: R$" + df.format(convertedAmount));
        } else if (choice == 2) {
            System.out.print("Enter the amount in Reais: R$");
            double amountInReais = scanner.nextDouble();
            double convertedAmount = amountInReais * realToDollarExchangeRate;
            System.out.println("Converted amount: $" + df.format(convertedAmount));
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
