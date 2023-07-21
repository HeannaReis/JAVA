import java.util.Scanner;

public class NetSalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your hourly wage: ");
        Double hourlyWage = scanner.nextDouble();

        System.out.println("Enter the total discount: ");
        Double totalDiscount = scanner.nextDouble();

        System.out.println("Enter the total hours worked in the month: ");
        int totalHoursWorked = scanner.nextInt();

        Double netSalary = (hourlyWage * totalHoursWorked) - totalDiscount;

        String formattedNetSalary = String.format("%.2f", netSalary);

        System.out.println("Employees Name: " + name);
        System.out.println("Net Monthly Salary: " + formattedNetSalary);
        scanner.close();
    }
}
