import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Book, String> booksHM = new HashMap<Book, String>();
        booksHM.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        booksHM.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        booksHM.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        booksHM.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");

        LinkedHashMap<Book, String> booksLHM = new LinkedHashMap<Book, String>();
        booksLHM.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        booksLHM.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        booksLHM.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        booksLHM.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");

        TreeMap<Book, String> booksTM = new TreeMap<Book, String>();
        booksTM.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        booksTM.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        booksTM.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        booksTM.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");

        booksHM.size();
        booksHM.containsKey("");
        booksHM.isEmpty();
        System.out.println();

        printMap(booksHM);
        printMap(booksLHM);
        printMap(booksTM);
        System.out.println();
    }

    public static void printMap(Map<Book, String> map) {
        System.out.println("\n" + map.getClass().getSimpleName());
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        });
        System.out.println("\tmap.keySet().toArray()[2]: " + map.keySet().toArray()[2]);
    }
}
