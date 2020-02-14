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

@WebServlet("/Associate")
public class Associate extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String aid = req.getParameter("aid");
        String sno = req.getParameter("sno");
        ClientwithResponseHandler c1= new ClientwithResponseHandler();
        String fstatus=c1.function1(aid,sno);
        PrintWriter p=resp.getWriter();
        p.println(fstatus);

        if(fstatus.equals("successful")) {
            dbconnect d1 = new dbconnect();
            d1.connect(aid, sno, fstatus);
        }
    }
}
