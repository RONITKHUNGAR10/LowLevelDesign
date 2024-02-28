package SqlDatabase.Services;

import SqlDatabase.Entities.Database;
import SqlDatabase.Entities.Row;
import SqlDatabase.Entities.Table;
import SqlDatabase.Enums.SupportedColumnTypes;

public class Main {
    public static void main(String[] args) throws Exception {
        DatabaseManager databaseManager = DatabaseManager.getInstance();
        Row row1 = new Row();
        Row row2 = new Row();
        row1.createRow(1,"Name", SupportedColumnTypes.STRING,0,"Ronit");
         row2.createRow(2,"Age", SupportedColumnTypes.INTEGER,26,null);
        Table table1 = new Table(1,"Table1");
        OperationFactory operationFactory = new OperationFactory();
        Operation insert = operationFactory.operationName("Insert");
        insert.operation(table1,row1);
        insert.operation(table1,row2);
        DataBaseFunctionsImpl dataBaseFunctions = new DataBaseFunctionsImpl();
        Database database1 = dataBaseFunctions.createDataBase("Database1");
        dataBaseFunctions.addTable(database1,table1);
        databaseManager.addDatabase(database1.getDatabaseName(), database1);
        dataBaseFunctions.printAllRecordsOfTable(databaseManager.getDatabase("Database1").getTableIdToTableMap().get("Table1"));
       // System.out.println( databaseManager.getDatabase("Database1").toString());
    }
}
