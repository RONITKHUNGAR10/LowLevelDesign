import Entities.BookItem;
import Entities.Inventory;
import Services.BookServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        BookItem bookItem1 = new BookItem(1, "Harry Potter", "Charles Dicked", 1);
        BookItem bookItem2 = new BookItem(2, "Fast Furious", "Charles Dicken", 2);
        Inventory inventory = new Inventory();
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.addBookItem(bookItem1,inventory);
        bookService.addBookItem(bookItem2, inventory);
        System.out.println(inventory.getTotalBooks().toString());
    }
}
