/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge_uts;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author LENOVO
 */
class DatabaseConnection {
     private static final String URL = "jdbc:mysql://localhost:3306/namadatabase";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    
}
