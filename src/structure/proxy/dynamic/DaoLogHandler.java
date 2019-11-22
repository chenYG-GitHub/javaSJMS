package structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:32
 * @description : 请求处理程序
 * @modified By :
 */
public class DaoLogHandler implements InvocationHandler {
    private Calendar calendar;
    private Object object;

    public DaoLogHandler(Object object) {
        this.object = object;
    }

    public DaoLogHandler() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object, args);
        afterInvoke();
        return result;
    }

    private void afterInvoke() {
       System.out.println("方法调用结束");
    }

    private void beforeInvoke() {
        calendar = new GregorianCalendar();
        System.out.println("调用时间：" + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
    }
}
