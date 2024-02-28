package Entities;



import java.util.ArrayList;
import java.util.List;



public class Inventory  {
    public List<BookItem> bookItemList = new ArrayList<>();

    public List<BookItem> getTotalBooks(){
        return bookItemList;
    }
}
