package Task4;

import java.sql.*;

public class Task4{

    private static Task4 instance;
    private Connection connection;


    private Task4() throws SQLException {
        String connectionString = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "0000";

        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(connectionString, user, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public ResultSet query(PreparedStatement query) {
        ResultSet ns = null;

        try {
            ns = query.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Database query Failed : " + ex.getMessage());
        }

        return ns;

    }

    public static Task4 getInstance() throws SQLException {
        if (instance == null) {
            instance = new Task4();
        } else if (instance.getConnection().isClosed()) {
            instance = new Task4();
        }

        return getInstance();
    }
}