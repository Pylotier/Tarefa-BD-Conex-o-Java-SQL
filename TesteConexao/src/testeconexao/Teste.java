package testeconexao;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {

    public static void main(String[] args){
        GenericDaoSQLSever gDaoSQLSever = new GenericDaoSQLSever();

        try{
            Connection c = gDaoSQLSever.getConnection();
            String sgbd = c.getMetaData().getDatabaseProductName();
            System.out.println(sgbd);
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}