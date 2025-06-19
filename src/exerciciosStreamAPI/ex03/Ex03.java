package exerciciosStreamAPI.ex03;

import java.util.Arrays;
import java.util.List;

public class Ex03{
    public static void main(String[] args) {
//        Desafio 3 - Verifique se todos os números da lista são positivos:
//        Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(-1,-2,-3,-4,1,2,3,4);

        numeros.stream()
                .filter(n -> n > 0)
                .forEach(System.out::println);

    }
}
