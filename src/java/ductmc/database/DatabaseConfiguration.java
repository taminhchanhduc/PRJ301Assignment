/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.database;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Peter
 */
public class DatabaseConfiguration implements Serializable {
    
    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;database=KeyCap4U";
        Connection conn = DriverManager.getConnection(url, "sa", "0404@HBcd");
        return conn;
    }
}
