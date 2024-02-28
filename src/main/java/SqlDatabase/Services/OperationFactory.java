package SqlDatabase.Services;

public class OperationFactory {
    public Operation operationName(String name){
        if(name.equals("Insert"))
            return new InsertOperation();
        else if(name.equalsIgnoreCase("Delete"))
            return new DeleteOperation();
        else
            return new GetByIdOperation();
    }
}
