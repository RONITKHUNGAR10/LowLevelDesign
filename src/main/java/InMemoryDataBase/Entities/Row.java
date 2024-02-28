package InMemoryDataBase.Entities;

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
public class Row {

    int rowId;

    Map<String,String> columnNameToValueMap;

    Date createdAt;

    Date updatedAt;


}
