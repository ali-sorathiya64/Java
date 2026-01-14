package StreamsPractical.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class ErrorHandlingByStreams {
    public static void main(String[] args) {


        List<String> books = Arrays.asList("Java", "Python", "Javascript");

        books.stream().forEach(b-> {
            try{
                if (b.equals("Java"))
                    throw new RuntimeException("Book already in the list");
                System.out.println(b );


            }
            catch (Exception e){
               e.printStackTrace();
            }
        });

    }
}
