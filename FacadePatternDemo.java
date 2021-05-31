import facade_pattern.Facade;
import facade_pattern.Facade.DBTypes;
import facade_pattern.Facade.FormatTypes;

public class FacadePatternDemo {
    public static void main(String[] args) {
        
        Facade.generateReport(DBTypes.MYSQL, FormatTypes.PDF);

        Facade.generateReport(DBTypes.ORACLE, FormatTypes.WORD);

    }
}
