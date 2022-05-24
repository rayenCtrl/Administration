package LoginMainGerer;

import java.sql.*;

public class DBConnection {
    private static Connection connection = null;
    private static Utilisateur userr = null;
    private static final String db = "mydb";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, user, password);
                System.out.println("Connected to the database");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

        }
        return connection;

    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // reset the connection
    public static void resetConnection() {
        connection = null;
    }

    public DBConnection() {
    }

    public static Utilisateur getUserr() {
        return userr;
    }

    public static void setUserr(Utilisateur userr) {
        DBConnection.userr = userr;
    }

    // main method
    public static void main(String[] args) {
        DBConnection.getConnection();
        DBConnection.closeConnection();
    }
}
