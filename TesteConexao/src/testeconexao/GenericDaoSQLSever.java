package testeconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoSQLSever {
    
    private Connection c;
    
    public GenericDaoSQLSever(){
        super();
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        String hostName = "localhost"; //IP da máquina do servidor
        String dbName = "testeConecxao"; //Nome do BD
        String user = "marcos2"; //Nome do usuário SQL Server
        String senha = "senha1234"; //Senha do usuário SQL Server
        
        Class.forName("net.sourceforge.jtds.jdbc.Driver"); //Referência da classe dalib de conexão
        //Configuração da String de conexão com SQL Server
        c = DriverManager.getConnection(
        String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s", hostName, dbName, user, senha));
        
        return c;
    }
}
