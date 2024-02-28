package InMemoryDataBase.Entities;

import InMemoryDataBase.Services.Impl.DataBaseFunctionsImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Database extends DataBaseFunctionsImpl {
    String databaseName;
    Map<String,Table>  tableNameToTableMap;
    Date createdAt;
}
