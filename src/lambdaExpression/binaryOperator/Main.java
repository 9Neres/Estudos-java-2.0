package lambdaExpression.binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String [] args){
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Refere-se à interface funcional BinaryOperator<T>.
        //Usada para realizar operações que recebem dois argumentos do mesmo tipo e retornam um resultado do mesmo tipo.

        BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;

        // 0 e como uma variavel temporario para fazer a soma até terminar com o array
        int result = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma foi de:\t" + result);
    }
}
