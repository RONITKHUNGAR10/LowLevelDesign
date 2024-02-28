package Services;

import Entities.BookItem;
import Entities.Inventory;


public class BookServiceImpl implements BookService{
    @Override
    public void addBookItem(BookItem bookItem,Inventory inventory) {
        inventory.getTotalBooks().add(bookItem);
    }
}
