package com.example.bigmac;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DBManagerTest {
    private static final String DB_URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static final String DB_USER = "BigMac";
    private static final String DB_PASSWORD = "";

    @BeforeAll
    public static void setUp() throws SQLException {
        createTables();
    }

    @AfterAll
    public static void tearDown() throws SQLException {
        dropTables();
    }
//tests the getConnection() in Dbmanager
    @Test
    public void testGetConnection() throws SQLException {
        try (Connection conn = DBManager.getConnection()) {
            assertNotNull(conn);
        }
    }
 //establish a connection to the database and execute SQL statements to create and drop the required tables.
    private static void createTables() throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS pasta (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), meat VARCHAR(255), pasta_type VARCHAR(255), has_cheese BOOLEAN, has_seafood BOOLEAN, has_bacon BOOLEAN, has_tomato BOOLEAN, has_salami BOOLEAN, price DOUBLE)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS pizza (id INT AUTO_INCREMENT PRIMARY KEY, size VARCHAR(255), num_toppings INT, is_gluten_free BOOLEAN, price DOUBLE)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS burger (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), meat VARCHAR(255), bread VARCHAR(255), cheese BOOLEAN, lettuce BOOLEAN, tomato BOOLEAN, onion BOOLEAN, pickles BOOLEAN, ketchup BOOLEAN, mustard BOOLEAN, mayo BOOLEAN, price DOUBLE)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS drink (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), price DOUBLE, is_alcoholic BOOLEAN, is_cold BOOLEAN)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS gyros (id INT AUTO_INCREMENT PRIMARY KEY, meat VARCHAR(255), has_tomatoes BOOLEAN, has_onions BOOLEAN, has_lettuce BOOLEAN, has_tzatziki BOOLEAN, price DOUBLE)");
        }
    }

    private static void dropTables() throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("DROP TABLE IF EXISTS pasta");
            stmt.executeUpdate("DROP TABLE IF EXISTS pizza");
            stmt.executeUpdate("DROP TABLE IF EXISTS burger");
            stmt.executeUpdate("DROP TABLE IF EXISTS drink");
            stmt.executeUpdate("DROP TABLE IF EXISTS gyros");
        }
    }
}
