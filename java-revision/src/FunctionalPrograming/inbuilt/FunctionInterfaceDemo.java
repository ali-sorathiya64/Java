package FunctionalPrograming.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceDemo {

public static Function <Integer,Integer> subFunc= (a)->a-3;
public static Function <Integer,Integer> addFunc= (a)->a+15;
public static Function <Integer ,Integer>  CombineFunction = addFunc.andThen(subFunc);

    public static void main(String[] args){
        System.out.println(addFunc.apply(100));
        System.out.println(subFunc.apply(10));
        System.out.println(CombineFunction.apply(15));


}
}
