package Optionals;

import java.util.Optional;

public class FunctionalOperations {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("Ali sorathiya");
        // ifPresent()
        stringOptional.ifPresent((value)-> System.out.println(value) );

        // map()
        Optional<String> upperCase= stringOptional.map((n)->n.toUpperCase());
        System.out.println(upperCase.orElse("def"));


        // filter()
        Optional<String> temp = stringOptional.filter(n->n.startsWith("P"));
        temp.ifPresent(System.out::println);


        // Combine Operation

        stringOptional.filter(n->n.startsWith("P"))
                .map((ali)->ali.toUpperCase())
                .ifPresent(n-> System.out.println(n));
    }
}
