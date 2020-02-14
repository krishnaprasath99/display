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

@WebServlet("/Test")
public class Test extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String aid = req.getParameter("aid");
        String sno = req.getParameter("sno");
        PrintWriter p=resp.getWriter();
        //p.println(fstatus);

        int value=-1;
            dbconnect d1 = new dbconnect();
            value=d1.connectt(aid, sno);

            if(value==0)
            {
                p.println("Data entry is not present");
            }
            if(value>0)
            {
                p.println("Data entry is present");
            }


    }
}
