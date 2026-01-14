package StreamsPractical;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] a) {
        List<String> items = Arrays.asList("Apple", "Banana", "hyd");


//        for (String fruits : items)
//            System.out.println(fruits);

//        Stream<String> stream = items.stream();
//        stream.forEach((item)-> System.out.println(item));


//        Stream <String> stream2 = items.stream();
//     Stream <String> filterdStream = stream2.filter(name -> name.startsWith("A"));
//        filterdStream.forEach(item -> System.out.println(item));

        List<Integer> numbers = Arrays.asList(1, 3, 4, 40, 5, 7);
        List <Integer> isEvenNumbers = numbers.stream().filter(num -> num %2==0).toList();
        Stream<Integer> resultStream = isEvenNumbers.stream();
        resultStream.forEach(item -> System.out.println(item));



    }

}


