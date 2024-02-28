package SqlDatabase.Services;

import SqlDatabase.Entities.Database;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

//Singelton Class;
public class DatabaseManager {

    private static DatabaseManager databaseManager;

   @Getter
   private static Map<String, Database> databaseHashMap=new HashMap<>();


    private DatabaseManager(){

    }

    public static DatabaseManager getInstance(){
        if(databaseManager==null)
            databaseManager =  new DatabaseManager();
        return databaseManager;
    }

    public  void addDatabase(String key,Database database){
        databaseHashMap.put(key, database);
    }

    public Database getDatabase(String key){
     return databaseHashMap.get(key);
    }
}
