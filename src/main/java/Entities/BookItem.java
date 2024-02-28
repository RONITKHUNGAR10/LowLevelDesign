package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookItem extends Book{
    int uniqueId;
    boolean reservationStatus;
    Date dueDate;

    public BookItem(int id, String bookName, String bookAuthor, int uniqueId) {
        super(id, bookName, bookAuthor);
        this.uniqueId=uniqueId;
    }
}
