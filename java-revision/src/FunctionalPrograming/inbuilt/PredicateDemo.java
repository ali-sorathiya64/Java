package FunctionalPrograming.inbuilt;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> isOdd = n -> n%2 !=0;
        System.out.println("Using Predicate : " + isOdd.test(5));


        BiPredicate<Integer ,Integer> isEven =(a,b)->(a+b) %2 ==0;
        System.out.println("Using BiPredicate : " +isEven.test(5,2));

    }
}
