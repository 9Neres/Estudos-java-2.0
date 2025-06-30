package exerciciosStreamAPI.ex10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex10 {
    public static void main(String[] args) {
//        Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//        Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

                List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 10, 12, 15, 17, 18, 20, 21, 25, 27, 30);

                Map<String, List<Integer>> agrupados = numeros.stream()
                        .filter(n -> n % 2 != 0) // ímpares
                        .filter(n -> n % 3 == 0 || n % 5 == 0) // múltiplos de 3 ou 5
                        .collect(Collectors.groupingBy(n -> {
                            if (n % 3 == 0 && n % 5 == 0) return "Múltiplo de 3 e 5";
                            else if (n % 3 == 0) return "Múltiplo de 3";
                            else return "Múltiplo de 5";
                        }));

                agrupados.forEach((grupo, lista) -> {
                    System.out.println(grupo + ": " + lista);
                });
    }
}
