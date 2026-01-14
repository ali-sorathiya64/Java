package StreamsPractical.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {
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

//        System.out.println("Books published before 2000");
//        Stream<Book>filterPublishedDate = books.stream()
//                .filter(p ->p.publicationYear <2000);
//        filterPublishedDate.forEach(System.out::println);
//
//        System.out.println("Book titles characters are more than 20");
//
//        Stream<Book>moreThan20 = books.stream()
//                .filter(book -> book.title.length()>20);
//        moreThan20.forEach(System.out::println);


//        System.out.println("Book prices in ascending order");
//        Stream<Book>priceInAscending = books.stream()
//                .sorted(Comparator.comparingDouble(book -> book.price));
//        priceInAscending.forEach(System.out::println);
//
//
//        System.out.println("Add upcoming suffix");
//       Stream <String> addSuffix = books.stream()
//               .map(book -> book.title + "comming soon");
//       addSuffix.forEach(System.out::println);

      double total = books.stream().mapToDouble(p -> p.price).reduce(0,(acc,res)->acc+res);
        System.out.println(total);


        // collect

//        List<String> collectTitle = books.stream()
//                .map(book -> book.title).collect(Collectors.toUnmodifiableList());
//        System.out.println(collectTitle);


        // Grouping by categories
        Map<String ,List <Book> >byCategory=
        books.stream().collect(Collectors.groupingBy(book -> book.category));
        byCategory.forEach((s, books1) -> books1 .forEach(System.out::println));

    }

}
