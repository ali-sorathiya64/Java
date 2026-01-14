package StreamsPractical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPipeline {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,4,5,6,7);
        Stream<Integer> stream = numbers.stream();
        Stream<Integer> isEvenNumbers = stream.filter(p2);
        List<Integer> resultStream = isEvenNumbers.toList();
        System.out.println(resultStream);


        System.out.println("3rd Iteration");

        List<Integer> evenNumber3 = numbers.stream()
                .filter(p2)
                .collect(Collectors.toList());
        System.out.println("With the 3rd iteration : " +evenNumber3);
    }

    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
           int remainder = integer %2;
           if (remainder == 0) return  true;
           return  false;
        }
    };

    static Predicate<Integer> p2 = (n)-> n%2==0;
}
