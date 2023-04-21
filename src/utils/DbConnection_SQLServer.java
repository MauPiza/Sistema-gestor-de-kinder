package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DbConnection_SQLServer {

    Connection connection = null;

    private final String controller = "com.microsoft.sqlserver.jdbc.SQLServerConnection";//Librería de Mysql JDBC Driver
    private final String user = "usersql";
    private final String password = "root";
    private final String db = "SistemaCalificacionesKinder";
    private final String ip = "localhost";
    private final String port = "1433";

    private final String connectionString = "jdbc:sqlserver://" + ip + ":" + port + "/" + db;

    public DbConnection_SQLServer() {
    }

    public Connection connect() {
        try {
            String connectionString = "jdbc:sqlserver://" + ip + ":" + port + ";" + "databaseName=" + db;
            setConnection(DriverManager.getConnection(connectionString, user, password));
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar con base de datos \n Error: " + e.getMessage());
        }
        return connection;
    }
    
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() {
        try {
            getConnection().close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
