package InMemoryDataBase.Services.Impl;

import InMemoryDataBase.Entities.Row;
import InMemoryDataBase.Entities.Table;
import InMemoryDataBase.Services.TableFunctions;
import org.apache.logging.log4j.util.Strings;

import java.util.HashMap;
import java.util.Map;

public class TableFunctionsImpl implements TableFunctions {
//    @Override
//    public Table createTable(String tableName) throws Exception {
//        if(Strings.isNotBlank(tableName))
//        {
//            System.out.println("Table name cannot be empty");
//            throw new Exception();
//        }
//
//        return new Table(tableName,new HashMap<>());
//    }

    @Override
    public boolean addRow(Row row,Table table) throws Exception {
        if(table!=null & row !=null){
            if(table.getRowIdToRowMap()!=null)
            {
                Map<Integer, Row> rowIdToRowMap = table.getRowIdToRowMap();
                if(rowIdToRowMap.containsKey(row.getRowId()))
                    throw new Exception("Row already exists");
                rowIdToRowMap.putIfAbsent(row.getRowId(),row);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateRow(Row row, Table table) throws Exception {
        if(table!=null & row !=null){
            if(table.getRowIdToRowMap()!=null)
            {
                Map<Integer, Row> rowIdToRowMap = table.getRowIdToRowMap();
                if(!rowIdToRowMap.containsKey(row.getRowId()))
                    throw new Exception("Row does not exists");
                rowIdToRowMap.put(row.getRowId(),row);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Row row, Table table) throws Exception {
        if(table!=null & row !=null){
            if(table.getRowIdToRowMap()!=null)
            {
                Map<Integer, Row> rowIdToRowMap = table.getRowIdToRowMap();
                if(!rowIdToRowMap.containsKey(row.getRowId()))
                    throw new Exception("Row does not exists");
                rowIdToRowMap.remove(row.getRowId());
                return true;
            }
        }
        return false;
    }
}
