package structure.proxy.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 20:51
 * @description : 日志记录类
 * @modified By :
 */
public class Logger {

    public void log(String userId) {
        System.out.println("更新数据库，用户[" + userId + "]查询次数加1");
    }

}
