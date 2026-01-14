package Optionals;

import java.util.Optional;

public class OptionalsDemo {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("ali");
        System.out.println(optionalString);


        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> Null = Optional.ofNullable(null);
        System.out.println(Null);


        // orElse
        System.out.println(optionalString.orElse("default"));
        System.out.println(Null.orElse("Null"));


        // or elseGet
        String result = empty.orElseGet(() -> {
                    System.out.println("Generating default value ");
                    return "Default";
                }
        );
        System.out.println(result);


        // or elseThrow

        String demoElseThrow = Null.orElseThrow(()->new
                RuntimeException("Not message"));
        System.out.println(demoElseThrow);
    }
}
