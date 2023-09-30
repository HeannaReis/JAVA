package StreamApi.ChallangeStreamAPI;

import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        ArrayNumeros arrayNumeros = new ArrayNumeros(); // Criar uma instância
        List<Integer> numeros = arrayNumeros.getNumeros(); // Obter a lista de números

        int somaDosPares = numeros.stream()
                .filter(num -> num % 2 == 0) // Filtrar os números pares
                .mapToInt(Integer::intValue) // Converter para um IntStream
                .sum(); // Calcular a soma

        System.out.println("Soma dos números pares: " + somaDosPares);
    }
}