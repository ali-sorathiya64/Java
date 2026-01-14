package FunctionalPrograming.inbuilt;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class RealExamples {

    public static void main(String[] args) {

        BiFunction<String, Integer, String> formattedString = (name, cost) ->
                name + "cost is :" + cost;
        System.out.println(formattedString.apply("demo", 15000));
    }
}
