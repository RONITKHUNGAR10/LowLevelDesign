package Services;

import Entities.BookItem;
import Entities.Inventory;

public interface BookService {
    void addBookItem(BookItem bookItem, Inventory inventory);
}
