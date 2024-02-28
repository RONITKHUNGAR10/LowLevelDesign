package SqlDatabase.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
public class Database  {
    String databaseName;
    Map<String,Table> tableIdToTableMap;
    Date createdAt;

    public Database(String databaseName,Map<String,Table> tableIdToTableMap,Date createdAt){
        this.databaseName=databaseName;
        this.tableIdToTableMap=tableIdToTableMap;
        this.createdAt=createdAt;
    }
}
