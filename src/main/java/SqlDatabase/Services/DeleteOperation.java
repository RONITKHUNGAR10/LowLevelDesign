package SqlDatabase.Services;

import SqlDatabase.Entities.Key;
import SqlDatabase.Entities.Row;
import SqlDatabase.Entities.Table;
import lombok.Builder;

import java.util.Map;

public class DeleteOperation implements Operation{
    @Override
    public void operation(Table table, Row row) throws Exception {
        if(table!=null && row !=null){
            Map<Key, Row> rowIdToRowMap = table.getRowIdToRowMap();
            rowIdToRowMap.remove(row.getId(),row);
        }
    }

}
