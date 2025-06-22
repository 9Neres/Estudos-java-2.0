package lambdaExpression.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main (String [] args){

        // sempre usa o , inves do + pode ocorrer bug
        List<String> palavras = Arrays.asList("Python","Kotlin","Java","Go","Ruby");

        //Refere-se à interface Predicate<T>, usada para testes booleanos (retorna true ou false).
        //Muito usada em filtros.

        Predicate<String> maisCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida
        // Imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
