package tech.jianshuo.servlet.c8;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author zhen.yu
 * Created on 2018-08-07
 */
@WebListener
public class AppListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        Map<String, String> countries = new HashMap<>();
        countries.put("ca", "Canada");
        countries.put("us", "United States");
        context.setAttribute("countries", countries);
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
