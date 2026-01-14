package FunctionalPrograming.inbuilt;


import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunc {

    public static BiFunction<Integer,Integer ,Integer> addFunc =
           Integer::sum;
    public BiFunction<Integer ,Integer,Integer> subFunc=(c,d)->c-d;


    public static void main(String[] args) {

//        BiFunc b = new BiFunc();
//        System.out.println(addFunc.apply(10,20));
//        System.out.println(b.subFunc.apply(20,30));

       Function<Integer ,Integer> multiplyBy10 =x->x*5;
        BiFunction<Integer,Integer,Integer> combineFunc = addFunc.andThen(multiplyBy10);

        System.out.println(combineFunc.apply(3,6));

    }
}