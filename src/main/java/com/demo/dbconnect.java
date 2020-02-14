package com.demo;



import java.sql.*;

/**
 *
 * @author postgresqltutorial.com
 */
public class dbconnect{

    private final String url = "jdbc:postgresql://localhost/testdb";
    private final String user = "postgres";
    private final String password = "Moniajit@2003";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public void connect(String ss1, String ss2, String ss3) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to the PostgreSQL server successfully.");

            //String str = "create table table5 ( aid varchar(255), sno varchar(255),status varchar(255));";
            //PreparedStatement statement = conn.prepareStatement(str);
            //statement.executeQuery();
            String s1="b",s2="b";
            PreparedStatement pt = conn.prepareStatement("INSERT INTO \"table5\" values(?,?,?)");
            pt.setString(1,ss1);
            pt.setString(2,ss2);
            pt.setString(3,ss3);
            pt.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //return conn;
    }

    public void connectd(String ss1, String ss2, String ss3) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to the PostgreSQL server successfully.");

            PreparedStatement pt = conn.prepareStatement("DELETE FROM table5 WHERE aid=? AND sno=?");
            pt.setString(1,ss1);
            pt.setString(2,ss2);
            pt.executeQuery();


        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public int connectt(String ss1, String ss2) {
        Connection conn = null;
        int val=-1;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to the PostgreSQL server successfully.");

            PreparedStatement pt = conn.prepareStatement("SELECT count(*) FROM table5 WHERE aid=? AND sno=?");
            pt.setString(1,ss1);
            pt.setString(2,ss2);
            pt.executeQuery();
            ResultSet rs2 = pt.getResultSet();

            while(rs2.next())
            {
                System.out.print(rs2.getInt(1));
                val=rs2.getInt(1);
                rs2.next();
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return val;
    }

    /**
     * @param args the command line arguments
     */

}

