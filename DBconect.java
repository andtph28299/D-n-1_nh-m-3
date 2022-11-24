/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DO VAN DAO
 */
public class DBconect {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=ASSIGNMENT_PRO1041;";
        String user = "sa";
        String pass = "andtph28299";
        Connection con = DriverManager.getConnection(connectionUrl, user, pass);
        return con;
    }
}
