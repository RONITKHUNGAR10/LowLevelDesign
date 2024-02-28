package InMemoryDataBase.Services;

import InMemoryDataBase.Entities.Database;
import InMemoryDataBase.Entities.Table;
import sun.tools.jconsole.Tab;

public interface DatabaseFunctions {
    Database createDataBase(String databaseName) throws Exception;

    Database addTable(Database database, Table table) throws Exception;

    Database deleteTable(Database database, Table table);

    void printAllRecordsOfTable(Table table) throws Exception;
}
