package lambdaExpression.supplier.ex02;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main (String [] args){


        //Refere-se à interface Supplier<T>, que não recebe nenhum argumento e retorna um valor.
        //Usada para geração de dados ou valores sob demanda.

        Supplier<String> comprimento = () -> "Olá";

        List<String> ListaSaudacao = Stream.generate(() -> "Olá")

                .limit(4)
                .toList();

        ListaSaudacao.forEach(System.out::println);

        Supplier<Integer> idade = () -> 19;

        List<Integer> ListaIdade = Stream.generate(idade)
                .limit(3)
                .toList();

        ListaIdade.stream().forEach(System.out::println);
    }
}
