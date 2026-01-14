package StreamsPractical.intermediate;

public class Book {
    String title;
    int publicationYear;
    double price;
    String category;

    @Override
    public String toString() {
        return STR."Book{title='\{title}', publicationYear=\{publicationYear}, price=\{price}, category='\{category}'}";
    }

    public Book(String title, int publicationYear, double price, String category) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
        this.category = category;
    }

    public static void main(String[] args) {

    }
}
