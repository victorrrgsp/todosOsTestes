package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
// uma classe do jdbc
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection (){
        if (conn == null) {
            try{
                // chama o metodo de ler o arquivo que estar armazenado a informações do banco
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                // aqui o banco estar sendo conectado com o projeto
                conn = DriverManager.getConnection(url, props);
            }catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    private static Properties loadProperties(){
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties pros = new Properties();
            pros.load(fs);
            return pros;
        } catch (IOException e) {
            // vai chamar a exceção personalizada
            throw new DbException(e.getMessage());
        }
    }

    public static void closeConnection(){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
