package testeconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoMySQL {
    
    private Connection c;
    
    public GenericDaoMySQL(){
        super();
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        String hostName = "localhost"; //IP da máquina do servidor
        String dbName = "testeConecxao"; //Nome do BD
        String user = "root"; //Nome do usuário MySQL
        String senha = "senha1234"; //Senha do usuário MySQL
        
        Class.forName("com.mysql.cj.jdbc.Driver"); //Referência da classe dalib de conexão
        //Configuração da String de conexão com MySQL
        c = DriverManager.getConnection(
        String.format("jdbc:mysql://%s:3306/%s", hostName, dbName), user, senha);
        
        return c;
    }
    
}
