package structure.proxy.remote.rmi.server;

import structure.proxy.remote.rmi.base.IHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 21:12
 * @description : IHello实现
 * @modified By :
 */
public class MyHello extends UnicastRemoteObject implements IHello {
    protected MyHello() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String message) throws RemoteException {
        System.out.println("连接成功!");
        return "你好，" + message + "!";
    }
}
