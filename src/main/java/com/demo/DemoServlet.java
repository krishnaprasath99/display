package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html><body>");
        try
        {
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/testdb", "postgres", "Moniajit@2003");
            // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from table3");
            out.println("<table border=1 width=50% height=50%>");
            out.println("<tr><th>uId</th><th>inviteURL</th><th>clientUserIdStr</th><th>sinceModifiedToken</th><th>invitecode</th><tr>");
            while (rs.next())
            {
                String n1 = rs.getString("uId");
                String n2 = rs.getString("InviteURL");
                String n3 = rs.getString("clientUserIdStr");
                String n4 = rs.getString("sinceModifiedToken");
                String n5 = rs.getString("inviteCode");
                //int s = rs.getInt("sal");
                out.println("<tr><td>" + n1 + "</td><td>" + n2 + "</td><td>" + n3 + "</td><td>" + n4 + "</td><td>" + n5 + "</td><td>");
            }
            out.println("</table>");
            out.println("</html></body>");
            con.close();
        }
        catch (Exception e)
        {
            out.println(e);
        }

    }

}
