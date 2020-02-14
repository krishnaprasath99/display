package com.demo;

import java.sql.*;

/**
 *
 * @author postgresqltutorial.com
 */
public class Postgrescon{

    private final String url = "jdbc:postgresql://localhost/testdb";
    private final String user = "postgres";
    private final String password = "Moniajit@2003";

    public Connection connect() {
        System.out.println("Im here!");
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");

            System.out.println("Im here!");


            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Im here!");

            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    private String displaydetails(ResultSet rs) throws SQLException {
        String details="",fstr="";
        while (rs.next()) {
            System.out.println(rs.getString("key") + "\t" + rs.getString("links"));
            details=rs.getString("key") + "\t" + rs.getString("links");
            fstr+=details + " ";
//            System.out.println("details = "+ details);

        }
        return fstr;
    }
    //public String s1="";
    public String getdetails() {

        String SQL = "SELECT * FROM table2 ";
        System.out.println(SQL);
        String s1="";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            System.out.println("in");
           //  display actor information
            s1=displaydetails(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return s1;
    }

    public static void main(String args[])
    {
        Postgrescon p=new Postgrescon();
        p.connect();
    }

}