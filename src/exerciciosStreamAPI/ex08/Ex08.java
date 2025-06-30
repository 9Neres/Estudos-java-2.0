package exerciciosStreamAPI.ex08;

import java.util.Arrays;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
//        Desafio 8 - Somar os dígitos de todos os números da lista:
//        Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.


          List<Integer> numeros = Arrays.asList(10,20,30,40);

          int numSomado = numeros.stream()
                  .reduce(0, Integer::sum);

          System.out.println( numSomado);

    }
}
