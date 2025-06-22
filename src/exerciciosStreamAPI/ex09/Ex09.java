package exerciciosStreamAPI.ex09;

import java.util.Arrays;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
//        Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
//        Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.


          List<Integer> numeros = Arrays.asList(1,3,3,4,5,6,7,8,9);

          Boolean numerosRepetidos = !(numeros.size() == numeros.stream()
                  .distinct()
                  .count());

        System.out.println(numeros);
        System.out.println(numerosRepetidos);
    }
}
