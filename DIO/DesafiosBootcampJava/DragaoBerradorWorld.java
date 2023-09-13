// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.io.IOException;
import java.util.Scanner;
public class DragaoBerradorWorld{

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int min = leitor.nextInt();
			int max = leitor.nextInt();
			int cont = 0;

// TODO: complete os espaços em branco com sua solução para o problema

			for (int i = 0; i < N; i++) {
				int A = leitor.nextInt();
				if ( A >= min && A <=max) cont++;
			}
			System.out.println(cont);
		}
	}
}