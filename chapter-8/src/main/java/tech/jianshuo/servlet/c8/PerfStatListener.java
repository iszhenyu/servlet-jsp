package tech.jianshuo.servlet.c8;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author zhen.yu
 * Created on 2018-08-07
 */
@WebListener
public class PerfStatListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

    }
}
