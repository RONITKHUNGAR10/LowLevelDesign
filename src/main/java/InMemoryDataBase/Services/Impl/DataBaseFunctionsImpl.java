package InMemoryDataBase.Services.Impl;

import InMemoryDataBase.Entities.Database;
import InMemoryDataBase.Entities.Table;
import InMemoryDataBase.Services.DatabaseFunctions;
import org.apache.logging.log4j.util.Strings;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DataBaseFunctionsImpl implements DatabaseFunctions {
    @Override
    public Database createDataBase(String databaseName) throws Exception {
             if(Strings.isNotBlank(databaseName))
        {
            System.out.println("Table name cannot be empty");
            throw new Exception();
        }

        return new Database(databaseName,new HashMap<>(),new Date());
    }

    @Override
    public Database addTable(Database database, Table table) throws Exception {
        if(database!=null && table!=null ){
            Map<String, Table> tableNameToTableMap = database.getTableNameToTableMap();
            if(tableNameToTableMap.containsKey(table.getTableName()))
            throw new Exception("Table already existis");
            tableNameToTableMap.putIfAbsent(table.getTableName(), table);
        }
        return database;
    }

    @Override
    public Database deleteTable(Database database, Table table) {
        if(database!=null && table!=null ){
            Map<String, Table> tableNameToTableMap = database.getTableNameToTableMap();
            tableNameToTableMap.remove(table.getTableName());
        }
        return database;
    }

    @Override
    public void printAllRecordsOfTable(Table table) throws Exception {
        if(table==null)
            throw new Exception("Table does not existis");
        System.out.println("Table Name : " + table.getTableName());
       table.getRowIdToRowMap().forEach((rowId, row) -> {
           System.out.println("Row id : " + rowId + " colums" + row.toString()) ;
       });
    }
}
