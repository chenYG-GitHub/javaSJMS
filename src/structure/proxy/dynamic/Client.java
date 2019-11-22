package structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:37
 * @description : 动态代理客户端测试类
 * @modified By :
 */
public class Client {
    public static void main(String[] args){
        UserDao userDao = new UserDaoImpl();
        InvocationHandler handler = new DaoLogHandler(userDao);
        UserDao proxy = (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(), new Class[]{UserDao.class},handler);
        proxy.findUserById("杨过");

        System.out.println("--------------------------------------");

        DocumentDao documentDao = new DocumentDaoImpl();
        InvocationHandler handlerDocument = new DaoLogHandler(documentDao);
        DocumentDao proxyDocument = (DocumentDao) Proxy.newProxyInstance(DocumentDao.class.getClassLoader(), new Class[]{DocumentDao.class}, handlerDocument);
        proxyDocument.deleteDocumentById("D01");

    }


}
