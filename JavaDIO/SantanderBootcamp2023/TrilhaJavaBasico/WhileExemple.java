

import java.util.concurrent.ThreadLocalRandom;

public class WhileExemple {
    public static void main(String[] args) {

        double salary = 50.00;

        while (salary > 0){
            Double valueSweet = aleatoryValue();
            // if(aleatoryValue > salary)
            // aleatoryValue = salary;

            System.out.println("Sweet of value: " + valueSweet + " Adicionado no carrinho");
            salary = salary - valueSweet;
    }
    System.out.println("Salary: " + salary);
    System.out.println("João spent all his salary.");
        
    
    }
    private static double aleatoryValue(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
    
}