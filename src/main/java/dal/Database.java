package dal;

import resoure.type.Message;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Database {
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rset = null;

    private String database = null;
    private String userDatabase = null;
    private String pass = null;
    private String urlDatabase = null;

    private Database()
    {
        checkDriver();
        readFileText();
        connect();

    }
    private void checkDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void connect() {
        try {
            String url = "jdbc:mysql://" + urlDatabase + "/" + database + "?useUnicode=true&characterEncoding=UTF-8";
            conn = DriverManager.getConnection(url, userDatabase, pass);
            stmt = conn.createStatement();

        } catch (SQLException e) {
            System.err.println("Can't connect '" + database + "'");
        }
    }
    public void closeConnect() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            System.out.println("Close connect '" + database + "' successly.\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Can't close connect " + database + "\n" + ex.getLocalizedMessage());
        }
    }
    public ResultSet sqlQuery(String qry) {
        if (checkConnect()) {
            try {
                rset = stmt.executeQuery(qry);
                return rset;

            } catch (SQLException ex) {
                System.err.println("Can't get data");
                return null;
            }
        }
        return null;
    }
    public boolean sqlUpdate(String qry) {
        if (checkConnect()) {
            try {
                stmt.executeUpdate(qry);
                return true;

            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return false;
    }
    public boolean checkConnect() {
        if (conn == null || stmt == null) {
            System.err.println("Can't connect data");
            return false;
        }
        return true;
    }


    private void readFileText()  {
        // Xử lý đọc file để lấy ra 4 tham số
        urlDatabase = "";
        database = "";
        userDatabase = "";
        pass = "";

        try {
            FileInputStream fis = new FileInputStream("ConnectVariable.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            urlDatabase = br.readLine();
            database = br.readLine();
            userDatabase = br.readLine();
            pass = br.readLine();

            if (pass == null) {
                pass = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getInstance()
    {
        if (conn==null || stmt == null) {
            new Database();
        }
    }


}
