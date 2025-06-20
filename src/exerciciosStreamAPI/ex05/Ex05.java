package exerciciosStreamAPI.ex05;

import java.util.Arrays;
import java.util.List;

import java.util.OptionalDouble;

public class Ex05 {
    public static void main(String[] args) {

//        Desafio 5 - Calcule a média dos números maiores que 5:
//        Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1,1,2,2,1,1,6,6,6,6,7,7);

        //                      opção 1

//      Usando mapToInt() e average()
//      OptionalDouble é uma classe "container" que pode ou não conter um valor double. É uma versão especializada da classe Optional para valores primitivos double
        OptionalDouble media = numeros.stream()
                .filter(n -> n > 5 )
                .mapToInt(Integer::intValue) // converte para Int Stream
                .average(); // calcula a media

        // is.Present e como um verificador se existir algo ele retorna **TRUE**, se não existir nada ele retorna **False**
        if (media.isPresent()) {
            System.out.println("Média dos números maiores que 5: " + media.getAsDouble());
        } else {
            System.out.println("Nenhum número maior que 5 encontrado");
        }



        //                     opcão 2

        Double media2 = numeros.stream()
                .filter(n -> n > 5)
                .collect(java.util.stream.Collectors.averagingInt(Integer::intValue));

        System.out.printf("%.2f", media2);
    }
}
