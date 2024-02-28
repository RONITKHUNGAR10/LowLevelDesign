package InMemoryDataBase.Entities;

import InMemoryDataBase.Services.Impl.TableFunctionsImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Table extends TableFunctionsImpl {
    String tableName;
    Map<Integer,Row> rowIdToRowMap;
}
