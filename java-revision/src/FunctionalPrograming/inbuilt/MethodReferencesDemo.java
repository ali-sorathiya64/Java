package FunctionalPrograming.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo
{
    public static void main(String[] args){

        List<String> names = Arrays.asList("Ali" ,"Suzan","Ebrahim");
//        for (String name :names){

//            System.out.println(name);
//        }
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//
//            }
//        });
//        names.forEach(( s) -> System.out.println(s));
        names.forEach(System.out::println);
    }

}


