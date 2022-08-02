import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int n=1;
        //complete o codigo
        while (  n > 0    ) {
            n = leitor.nextInt();
            if (  n > 0   ) { 
                //complete o codigo
                soma+= n;
                cont++;
            }
        }
        double media = (double) soma / cont;
        System.out.println(String.format("%.2f", media));
    }
}