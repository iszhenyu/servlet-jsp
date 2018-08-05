package tech.jianshuo.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author zhen.yu
 * Created on 2018-08-05
 */
@WebServlet(name = "GenericServletDemoServlet", urlPatterns = "/generic", initParams = {
        @WebInitParam(name = "admin", value = "zhen"),
        @WebInitParam(name = "email", value = "zhen@email")
})
public class GenericServletDemoServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String admin = config.getInitParameter("admin");
        String email = config.getInitParameter("email");
        res.getWriter().write("admin: " + admin + "; email: " + email);
    }
}
