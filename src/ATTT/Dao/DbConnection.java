/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Dao;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author longn
 */
public abstract class DbConnection {
    static Connection conn = null;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_USER_NAME = "root";
    static final String DB_PASSWORD = "12345678";
    static final String DB_URL = "jdbc:mysql://localhost:3306/malware";

    public static Connection getDbConnection() {

        try {

            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_PASSWORD);
            return conn;

        } catch (ClassNotFoundException ex1) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối CSDL", "ERROR", 0);
            return null;

        } catch (SQLException ex2) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối CSDL", "ERROR", 0);
            return null;

        } catch (Exception ex3) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối CSDL", "ERROR", 0);
            return null;
        }
    }
}
