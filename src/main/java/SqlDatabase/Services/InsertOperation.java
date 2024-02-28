package SqlDatabase.Services;

import SqlDatabase.Entities.Key;
import SqlDatabase.Entities.Table;
import SqlDatabase.Entities.Row;

import java.util.Map;

public class InsertOperation implements Operation{
    @Override
    public void operation(Table table, Row row) throws Exception {
        if(table!=null && row !=null){
            Map<Key, Row> rowIdToRowMap = table.getRowIdToRowMap();
            if(rowIdToRowMap.containsKey(row.getId()))
                throw new Exception("Row with given id already exists");
            rowIdToRowMap.put(row.getId(),row);
        }
    }
}
