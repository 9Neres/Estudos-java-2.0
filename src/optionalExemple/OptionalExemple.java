package optionalExemple;

import java.util.Optional;

public class OptionalExemple {
    public static void main(String[] args) {

        // Optional para lidar com valores que podem ser nulos de forma segura. Vou explicar o que acontece:

        //Optional.ofNullable(null) - Cria um Optional que pode conter um valor nulo. Como você passou null, o Optional estará vazio.
        //orElse("Default") - Se o Optional estiver vazio (como neste caso), retorna o valor padrão "Default".

        //O Optional é uma excelente ferramenta para evitar NullPointerException e tornar o código mais legível ao explicitar quando um valor pode ou não estar present

        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");

        System.out.println(result);

    }
}
