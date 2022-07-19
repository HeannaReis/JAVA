// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	double V, D, R, area, altura;
    	
//TODO: Complete os espaços em branco com uma possível solução para o desafio

    	while (leitor.hasNext()) {
    		V = leitor.nextDouble();
    		D = leitor.nextDouble();
    		R = D / 2;
    		area = 3.14 * (R * R);
    		altura = V / (3.14 * ( R * R));
    		System.out.println("ALTURA = " + df.format(altura));
    		System.out.println("AREA = " + df.format(area));
    	}
    }	
}