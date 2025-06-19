package exerciciosStreamAPI.ex01;

import java.util.Arrays;
import java.util.List;

//Desafio 1 - Mostre a lista na ordem numérica:
//Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
public class Ex01 {
    public static void main(String [] args){

                //        opção 1:
        List<Integer> numeros = Arrays.asList(1,3,4,2,5,6,7,9,8);

        numeros.stream()
                .sorted()
                .forEach(System.out::println);

               //       opção 2:

        System.out.println("\nOutra alternativa:\n");

        List<Integer> numero = numeros.stream()
                .sorted()
                .toList();

        numero.forEach(System.out::println);
    }
}
