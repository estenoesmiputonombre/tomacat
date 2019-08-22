package com.how.to.say.bye;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ByeServlet extends HttpServlet {

    static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Hello, World</title></head>");
            out.println("<body>");
            out.println("<h1>Hello, world!</h1>"); // says Hello
            // Echo client's req information
            out.println("<p>req URI: " + req.getRequestURI() + "</p>");
            out.println("<p>Protocol: " + req.getProtocol() + "</p>");
            out.println("<p>PathInfo: " + req.getPathInfo() + "</p>");
            out.println("<p>Remote Address: " + req.getRemoteAddr() + "</p>");
            // Generate a random number upon each req
            out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close(); // Always close the output writer
        }
    }

}