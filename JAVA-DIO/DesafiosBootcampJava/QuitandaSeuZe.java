/* Desafio
Seu Zé está vendendo frutas com a seguinte tabela de preços:

Exemplo 1

 	Até 5 Kg	Acima de 5 Kg
Morango	R$ 2,50 por Kg	R$ 2,20 por Kg
Maçã	R$ 1,80 por Kg	R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

Entrada
Como entrada, você recebera a quantidade em kg de morangos e a quantidade em kg de maçãs.

Saída
Será o valor a ser pago pelo cliente, conforme a tabela de preços da quintanda do seu Zé.

Exemplo 1

Entrada	Saída
3
2	11.1
 

Exemplo 2

Entrada	Saída
1
1	4.3
 

Exemplo 3

Entrada	Saída
5
5	19.35 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class QuitandaSeuZe{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int morangos = input.nextInt();
        int macas = input.nextInt();
        input.close();     
  
        double precoMorangos = morangos <= 5 ? 2.5 : 2.2;
        double precoMacas = macas <= 5 ? 1.8 : 1.5;
        
        double total = morangos*precoMorangos + macas*precoMacas;
        double desconto = (total > 25 || (morangos + macas) > 8) ? (total*0.1) : 0; 
        
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(total - desconto));
  
      }    
}
