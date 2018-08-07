package tech.jianshuo.servlet.c8;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author zhen.yu
 * Created on 2018-08-07
 *
 * 两个方法之间的执行时间即为一个url请求的耗时
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
