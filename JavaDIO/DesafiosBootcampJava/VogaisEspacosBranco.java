/* Desafio
Jorginho é professor do primário de uma determinada escola. 
Ele tem 100000 alunos e precisa criar um programa que verifica 
quantos espaços em branco e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avaliação final. 
Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!

Entrada
A entrada será uma frase no formato de string. 

Saída
A saída deverá retornar quantos espaços em branco e quantas vogais existem na determinada string, conforme exemplo abaixo:

 

     EXEMPLO DE ENTRADA			EXEMPLO DE SAÍDA 

		“Amo a DIO” 		    Espacos em branco: 2 Vogais: 5 

“Esse desafio foi facil”        Espacos em branco: 3 Vogais: 10 
 
“Navegar nas aguas do teu mar”  Espacos em branco: 5 Vogais: 11 
*/

import java.util.Arrays;
import java.util.Scanner;

public class VogaisEspacosBranco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int espacosEmBranco = str.split(" ").length - 1;
        int quantVogais = (int) str.chars().filter(e -> "aeiouAEIOU".indexOf(e) != -1).count();

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
