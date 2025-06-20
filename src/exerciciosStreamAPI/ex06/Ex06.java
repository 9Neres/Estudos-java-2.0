package exerciciosStreamAPI.ex06;

import java.util.Arrays;
import java.util.List;

public class Ex06 {
//    Desafio 6 - Verificar se a lista contém algum número maior que 10:
//    Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,12,44,6,21,34,3,5,7,98,0);

        numeros.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);

//        int x = numeros.size();       // Retorna um int — OK para listas comuns
//        long y = numeros.stream().count();  // Retorna um long — usado em Stream

        long contagem = numeros.stream()
                .filter(n -> n > 10)
                .count(); // conta o tamanho

        System.out.println("\nQuantos maior que dez:\t" + contagem + " números");
    }
}
