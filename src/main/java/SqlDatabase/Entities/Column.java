package SqlDatabase.Entities;

import SqlDatabase.Enums.SupportedColumnTypes;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter@Setter@NoArgsConstructor
public class Column {
    private String columnName;
    private String columnType;
    private Object value;

    public Column(String columnName,SupportedColumnTypes columnType,int integerValue,String stringValue){
        this.value= SupportedColumnTypes.INTEGER == (columnType) ? Integer.valueOf(integerValue) : stringValue;
        this.columnType=columnType.toString();
        this.columnName=columnName;
    }
}
