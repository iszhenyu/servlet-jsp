package tech.jianshuo.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhen.yu
 * Created on 2018-08-05
 */
@WebServlet(name = "FormServlet", urlPatterns = "/form")
public class FormServlet extends HttpServlet {

    private static final String TITLE = "Order Form";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>" + TITLE + "</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>" + TITLE + "</h1>");
        writer.println("<form method='post'>");
        writer.println("<table><tr><td>Name:</td><td><input name='name'/></td></tr><tr><td>Address:</td><td><input name='address'/></td></tr><tr><input type='submit'></tr></table>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>" + TITLE + "</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>" + TITLE + "</h1>");
        writer.println("<form method='post'>");
        writer.println("<table><tr><td>Name:</td><td>" + req.getParameter("name") + "</td></tr><tr><td>Address:</td><td>" + req.getParameter("address") + "</td></tr></table>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
