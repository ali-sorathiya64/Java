package StreamsPractical.TerminalOperation;

import StreamsPractical.intermediate.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationPractice {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(  new Book("The Great Gatsby", 1925, 15.99, "Classic"),
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


        // Total cost of all books

       //Collecting books into title

//        List<Book> collectingBooksTitle = books.stream().filter(book -> book)
    }
}
