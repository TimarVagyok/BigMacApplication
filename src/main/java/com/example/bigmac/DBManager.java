import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

    private static final String DB_URL = "jdbc:h2:~/restaurant_db";
    private static final String DB_USER = "BigMac";
    private static final String DB_PASSWORD = "";

    public static void createTables() {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS pasta (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), meat VARCHAR(255), pasta_type VARCHAR(255), has_cheese BOOLEAN, has_seafood BOOLEAN, has_bacon BOOLEAN, has_tomato BOOLEAN, has_salami BOOLEAN, price DOUBLE)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS pizza (id INT AUTO_INCREMENT PRIMARY KEY, size VARCHAR(255), num_toppings INT, is_gluten_free BOOLEAN, price DOUBLE)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS burger (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), meat VARCHAR(255), bread VARCHAR(255), cheese BOOLEAN, lettuce BOOLEAN, tomato BOOLEAN, onion BOOLEAN, pickles BOOLEAN, ketchup BOOLEAN, mustard BOOLEAN, mayo BOOLEAN, price DOUBLE)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS drink (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), price DOUBLE, is_alcoholic BOOLEAN, is_cold BOOLEAN)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS gyros (id INT AUTO_INCREMENT PRIMARY KEY, meat VARCHAR(255), has_tomatoes BOOLEAN, has_onions BOOLEAN, has_lettuce BOOLEAN, has_tzatziki BOOLEAN, price DOUBLE)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
