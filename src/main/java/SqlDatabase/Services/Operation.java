package SqlDatabase.Services;

import SqlDatabase.Entities.Table;
import SqlDatabase.Entities.Row;
import sun.tools.jconsole.Tab;

public interface Operation {
    void operation(Table table, Row row) throws Exception;

}
