package exerciciosStreamAPI.ex07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {

//        Desafio 7 - Encontrar o segundo número maior da lista:
//        Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

//        opção 1:

        int [] numero = {1,2,3,4,5,6};

        int segundoMaiorNum = Arrays.stream(numero)
                .boxed().sorted(Comparator.reverseOrder())//boxed e como um conversor de int -> interger exemplo tem outras formas também.
                .skip(1).findFirst().get();

        System.out.println(segundoMaiorNum);

        System.out.println("\n");



//        opção 2 :

        List<Integer> numeros = Arrays.asList(1,2,3,4);

        int segundoNum = numeros.stream()
                .sorted(Comparator.reverseOrder())
                        .skip(1).findFirst().get();

        //.skip(1)
        //Pula o primeiro elemento do stream ordenado. Como o stream está em ordem decrescente, isso significa que está pulando o maior elemento.

        //.findFirst()
        //Retorna um Optional contendo o primeiro elemento do stream atual (que seria o segundo maior elemento original, já que pulamos o primeiro).

        //.get()
        //Extrai o valor do Optional. Atenção: usar .get() pode lançar uma exceção se o Optional estiver vazio.

        System.out.println(segundoNum);
    }
}
