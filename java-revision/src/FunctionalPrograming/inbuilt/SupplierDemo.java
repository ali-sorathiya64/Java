package FunctionalPrograming.inbuilt;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args){
        Supplier<Double> isRandom = ()->Math.random();
        System.out.println(isRandom.get());
    }
}


