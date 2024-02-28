package SqlDatabase.Services;

import SqlDatabase.Entities.Key;
import SqlDatabase.Entities.Row;
import SqlDatabase.Entities.Table;
import lombok.Builder;
import lombok.Setter;

import java.util.Map;

public class GetByIdOperation implements Operation  {
   @Setter
   int id;
    public void operation(Table table, Row row) throws Exception {
        if(table!=null){
            Map<Key, Row> rowIdToRowMap = table.getRowIdToRowMap();
            if(!rowIdToRowMap.containsKey(Key.builder().rowId(id).build()))
                throw new Exception("Row with given id does not exists");
            Row row1 = rowIdToRowMap.get(Key.builder().rowId(id).build());
            System.out.println(row1.toString());
        }
    }
}
