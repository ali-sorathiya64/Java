package StreamsPractical.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateDemo {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", 1925, 15.99, "Classic"),
                new Book("Dune", 1965, 25.50, "Sci-Fi"),
                new Book("The Hobbit", 1937, 12.00, "Fantasy"),
                new Book("1984", 1949, 18.25, "Dystopian"),
                new Book("Clean Code", 2008, 45.00, "Technology"),
                new Book("The Alchemist", 1988, 10.50, "Adventure"),
                new Book("Project Hail Mary", 2021, 28.00, "Sci-Fi"),
                new Book("Java Concurrency in Practice", 2006, 52.99, "Technology"),
                new Book("The Shining", 1977, 20.00, "Horror"),
                new Book("The Silent Patient", 2019, 14.75, "Mystery")
        );

//         Filter operation
      Stream<Book> filterBookPrice = books.stream()
       .filter(p -> p.price<20);
      filterBookPrice.forEach(System.out::println);


//       Mapping operation covert book title to uppercase

        Stream<String> convertUppercase = books.stream()
                .map(book->book.title.toUpperCase());
        convertUppercase.forEach(System.out::println);


        // Sorting operation according to publication date
        Stream<Book> sortedBooks = books.stream()
                        .sorted(Comparator.comparingInt(book -> book.publicationYear));
        sortedBooks.forEach(System.out::println);


        //Remove duplicate / distinct
        Stream<Book> removeDuplicates = books.stream()
                .distinct();
        removeDuplicates.forEach(System.out::println);

// Limit : shows only those books as per condition

        Stream<Book> firstThreeBooks = books.stream()
                        .limit(2);
       firstThreeBooks.forEach(System.out::println);



       // Skip Books shows only 2 books
      Stream <Book> showFirstPublish = books.stream()
              .sorted(Comparator.comparingInt(b->b.publicationYear))
              .limit(2);
       showFirstPublish.forEach(System.out::println);


    }

}
