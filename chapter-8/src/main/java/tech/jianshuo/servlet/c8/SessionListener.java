package tech.jianshuo.servlet.c8;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author zhen.yu
 * Created on 2018-08-07
 */
@WebListener
public class SessionListener implements HttpSessionListener, ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.setAttribute("userCounter", new AtomicInteger());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        ServletContext context = session.getServletContext();
        AtomicInteger atomicInteger = (AtomicInteger) context.getAttribute("userCounter");
        int userCount = atomicInteger.incrementAndGet();
        System.out.println("current user count: " + userCount);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        ServletContext context = session.getServletContext();
        AtomicInteger atomicInteger = (AtomicInteger) context.getAttribute("userCounter");
        int userCount = atomicInteger.decrementAndGet();
        System.out.println("current user count: " + userCount);
    }
}
