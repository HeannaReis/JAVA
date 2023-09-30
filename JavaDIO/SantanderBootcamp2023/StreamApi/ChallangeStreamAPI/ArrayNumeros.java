package StreamApi.ChallangeStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ArrayNumeros {
    private List<Integer> numeros = Arrays.asList(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        public List<Integer> getNumeros() {
            return numeros;
    }
}
    

// List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
// ```

// - Desafio 1 - Mostre a lista na ordem numérica:

// Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.