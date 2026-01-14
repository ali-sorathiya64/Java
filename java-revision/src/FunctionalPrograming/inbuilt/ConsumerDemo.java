package FunctionalPrograming.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class ConsumerDemo {


    public static  void main(String args[]){
        Consumer<String> consumer =(str)-> System.out.println(str);
        Consumer<String> consumer1 = System.out::println;

        consumer1.accept("hello");


        List<Integer> numbers = Arrays.asList(1,2,3,4);
        Consumer<Integer> multiply = (n)-> System.out.println(n*2);
        numbers.forEach(multiply);


        BiFunction<String ,Double ,String> stringFormatter =(title , price)-> title + "price is :" + price;

        System.out.println(stringFormatter.apply("harry potter",1.5400));

        BiConsumer<String,Double> stringForamtter1 =(title ,price)-> System.out.println(title + " price :" + price);

        stringForamtter1.accept("harry" ,52.00);

    }

}
