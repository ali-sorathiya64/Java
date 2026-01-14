package StreamsPractical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourceDemo {
    public static  void  main(String[]a){

        // using collection
        List<Integer>numbers = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> integer = numbers.stream();
        integer.forEach(System.out::println);

        //using Array

        int[] nums ={10,20,30,40};
        IntStream integerStream = Arrays.stream(nums);
        integerStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("Messi" ,"Ronaldo","Vini jr");
        Stream<Integer> integerStream1 = Stream.iterate(0,n->n+2);
     try {
         Stream<String> fileStream = Files.lines(Path.of("path"));
         fileStream.forEach(System.out::println);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }


    }
}
