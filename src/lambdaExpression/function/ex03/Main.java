package lambdaExpression.function.ex03;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main (String [] args){

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Usar a função function com expressão lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2) // map e uma função que dobra no stream e armazena em outra lista
                .toList();

        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
