package Q8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> allBooks = loadAllBooks();

        // 1. Find books with more than 400 pages
        List<Book> booksMoreThan400Pages = allBooks.stream()
                .filter(b -> b.getPages() > 400)
                .toList();
        System.out.println("Books more than 400 pages:-> " +booksMoreThan400Pages);

        // 2. Find all books that are Java books and have more than 400 pages
        List<Book> javaBooksMoreThan400Pages = allBooks.stream()
                .filter(b -> b.getSubject() == Subject.JAVA && b.getPages() > 400)
                .toList();
        System.out.println("Java books with more than 400 pages:-> " +javaBooksMoreThan400Pages);


        // 3. We need the top three longest books
        List<Book> topThreeLongestBooks = allBooks.stream()
                .sorted(Comparator.comparingInt(Book::getPages).reversed())
                .limit(3)
                .toList();
        System.out.println("Top 3 longest books:-> " + topThreeLongestBooks);


        // 4. We need from the fourth to the last longest books
        List<Book> booksFromFourthToLast = allBooks.stream()
                .sorted(Comparator.comparingInt(Book::getPages).reversed())
                .skip(3)  // Skip the top 3
                .toList();
        System.out.println("Books from the fourth longest to the last:-> " + booksFromFourthToLast);


        // 5. We need to get all the publishing years
        List<Integer> publishingYears = allBooks.stream()
                .map(Book::getYear)
                .distinct() // To avoid duplicates
                .toList();
        System.out.println("Publishing years: " + publishingYears);


        // 6. We need all the authors' names who have written a book
        List<String> authorsNames = allBooks.stream()
                .flatMap(book -> book.getAuthors().stream())
                .map(author -> author.getName() + " " + author.getLastname())
                .distinct()
                .toList();
        System.out.println("Authors names:-> " + authorsNames);


        // 7. We need all the origin countries of the authors
        List<String> countries = allBooks.stream()
                .flatMap(book -> book.getAuthors().stream())
                .map(Author::getCountry)
                .distinct()
                .toList();
        System.out.println("Countries of authors:-> " + countries);


        // 8. We want the most recent published book.
        Book mostRecentBook = allBooks.stream()
                .max(Comparator.comparingInt(Book::getYear))
                .orElse(null); // In case there are no books
        System.out.println("Most recent published book:-> " + mostRecentBook);


        // 9. We want to know if all the books are written by more than one author
        boolean allBooksMultipleAuthors = allBooks.stream()
                .allMatch(book -> book.getAuthors().size() > 1);
        System.out.println("All books written by more than one author:-> " + allBooksMultipleAuthors);


        // 10. We want one of the books written by more than one author. (findAny)
        Optional<Book> anyBookWithMultipleAuthors = allBooks.stream()
                .filter(book -> book.getAuthors().size() > 1)
                .findAny();
        System.out.println("One book written by more than one author:-> " + anyBookWithMultipleAuthors);


        // 11. We want the total number of pages published.
        int totalPages = allBooks.stream()
                .mapToInt(Book::getPages)
                .sum();
        System.out.println("Total number of pages:-> " + totalPages);


        // 12. We want to know how many pages the longest book has.
        int longestBookPages = allBooks.stream()
                .mapToInt(Book::getPages)
                .max()
                .orElse(0);
        System.out.println("Longest book has pages:-> " + longestBookPages);

        // 13. We want the average number of pages of the books
        double averagePages = allBooks.stream()
                .mapToInt(Book::getPages)
                .average()
                .orElse(0);
        System.out.println("Average number of pages:-> " + averagePages);


        // 14. We want all the titles of the books
        List<String> bookTitles = allBooks.stream()
                .map(Book::getTitle)
                .toList();
        System.out.println("All book titles:-> " + bookTitles);


        // 15. We want the book with the higher number of authors
        Book bookWithMostAuthors = allBooks.stream()
                .max(Comparator.comparingInt(book -> book.getAuthors().size()))
                .orElse(null);
        System.out.println("Book with the highest number of authors:-> " + bookWithMostAuthors);


        // 16. We want a Map of books per year.
        Map<Integer, List<Book>> booksPerYear = allBooks.stream()
                .collect(Collectors.groupingBy(Book::getYear));
        System.out.println("Books per year:-> " + booksPerYear);


        // 17. We want to count how many books are published per year.
        Map<Integer, Long> booksCountPerYear = allBooks.stream()
                .collect(Collectors.groupingBy(Book::getYear, Collectors.counting()));
        System.out.println("Books count per year:-> " + booksCountPerYear);
        
    }

    private static List<Book> loadAllBooks() {
        List<Book> books = new ArrayList<Book>();
        List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
                new Author("ekta", "gupta", "in"));

        List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

        List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
                new Author("keshav", "gupta", "us"));

        books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
        books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
        books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

        return books;
    }
}
