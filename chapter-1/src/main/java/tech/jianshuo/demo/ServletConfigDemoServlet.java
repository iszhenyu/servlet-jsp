package tech.jianshuo.demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author zhen.yu
 * Created on 2018-08-01
 */
@WebServlet(name = "ServletConfigDemoServlet", urlPatterns = {"/c1/servletConfigDemo"},
    initParams = {
        @WebInitParam(name = "admin", value = "zhen"),
            @WebInitParam(name = "email", value = "zhen@163.com")
    }
)
public class ServletConfigDemoServlet implements Servlet {

    private transient ServletConfig servletConfig;

    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }

    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String admin = config.getInitParameter("admin");
        String email = config.getInitParameter("email");
        res.setContentType("text/html");
        res.getWriter().write("admin: " + admin + ", email: " + email);
    }

    public String getServletInfo() {
        return "ServletConfigDemoServlet";
    }

    public void destroy() {

    }
}
