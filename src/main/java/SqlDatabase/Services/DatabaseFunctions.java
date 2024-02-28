package SqlDatabase.Services;

 import SqlDatabase.Entities.Database;
 import SqlDatabase.Entities.Table;

public interface DatabaseFunctions {
    Database createDataBase(String databaseName) throws Exception;

    Database addTable(Database database, Table table) throws Exception;

    Database deleteTable(Database database, Table table);

    void printAllRecordsOfTable(Table table) throws Exception;
}
