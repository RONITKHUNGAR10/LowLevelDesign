package SqlDatabase.Entities;

import lombok.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
public class Table {
    int tableId;
    String tableName;
    Map<Key,Row> rowIdToRowMap;
    Date createdDate;

    public Table(int tableId,String tableName){
        this.tableId=tableId;
        this.tableName=tableName;
        rowIdToRowMap = new HashMap<>();
    }
}
