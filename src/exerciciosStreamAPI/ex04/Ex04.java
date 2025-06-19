package exerciciosStreamAPI.ex04;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {

//        Desafio 4 - Remova todos os valores pares:
//        Utilize a Stream API para remover os valores pares da lista e imprima a lista resultante no console.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numeros.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        int numero = numeros.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);

        System.out.println(numero);

    }
}
