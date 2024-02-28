package SqlDatabase.Entities;

import SqlDatabase.Entities.Column;
import SqlDatabase.Enums.SupportedColumnTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.LinkedHashMap;

@Getter
@NoArgsConstructor
public class Row {
    Key id;
    LinkedHashMap<String, Column> columnNameToValueMap;
    Date createdAt;

    public void createRow(int id, String columnName, SupportedColumnTypes columnType, Integer integerValue, String stringValue){
        this.id= Key.builder().rowId(id).build();
        columnNameToValueMap=new LinkedHashMap<>();
        Column column = new Column(columnName, columnType, integerValue, stringValue);
        columnNameToValueMap.put(columnName,column);
        this.createdAt=new Date();
    }

}

