package facade_pattern;

import java.sql.Connection;


public class Facade {

    public static enum DBTypes{
        MYSQL,
        ORACLE
    }

    public static enum FormatTypes{
        PDF,
        WORD
    }

    public static void generateReport(DBTypes dbType,FormatTypes formatType){

        Connection conn = null;
        System.out.println(conn);
        switch(dbType){
            case MYSQL:
                conn = MySQLHelper.getConnection();
                MySQLHelper mySQLHelper = new MySQLHelper();
                switch (formatType) {
                    case PDF:
                        mySQLHelper.printPDF();
                        break;
                    case WORD:
                        mySQLHelper.printWord();
                        break;
                    default:
                        break;
                }
            case ORACLE:
                conn = OracleHelper.getConnection();
                OracleHelper oracleHelper = new OracleHelper();   

                switch (formatType) {
                    case PDF:
                        oracleHelper.printPDF();
                        break;
                    case WORD:
                        oracleHelper.printWord();
                    default:
                        break;
                }
            default:
                break;
                
        }

    }

    
}