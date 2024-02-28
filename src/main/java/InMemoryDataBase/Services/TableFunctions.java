package InMemoryDataBase.Services;

import InMemoryDataBase.Entities.Row;
import InMemoryDataBase.Entities.Table;

public interface TableFunctions {
    //Table createTable(String tableName) throws Exception;

    boolean addRow(Row row,Table table) throws Exception;

    boolean updateRow(Row row, Table table) throws Exception;

    boolean delete(Row row, Table table) throws Exception;



}
