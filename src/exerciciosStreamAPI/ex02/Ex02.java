package exerciciosStreamAPI.ex02;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
//        Desafio 2 - Imprima a soma dos números pares da lista:
//        Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        filtrando os numeros pares e imprimindo

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

//        somando os numeros pares

        int numero = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(numero);
    }
}
