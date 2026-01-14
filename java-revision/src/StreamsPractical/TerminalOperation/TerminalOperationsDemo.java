package StreamsPractical.TerminalOperation;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsDemo {


    public static void main(String[] args) {

        //  Reduce Method
        List<Integer> nums = Arrays.asList(55,6);
        Stream<Integer> reduceEx = nums.stream();
//        int sum = reduceEx.reduce(0,(acc,res)->acc+res);
//        System.out.println(sum);


        int total = nums.stream()
                .reduce(0,Integer::sum);
        System.out.println(total);

        // collect Method
      List<Integer> isEvenNumber = nums.stream()
              .collect(Collectors.toUnmodifiableList());
      isEvenNumber.forEach(System.out::println);

        // Find and match
        System.out.println(nums.stream().findAny().get());


        Boolean has14 = nums.stream().anyMatch(n -> n==14);
        System.out.println(has14);



        // Iteration
        nums.forEach(System.out::println);

    }
}
