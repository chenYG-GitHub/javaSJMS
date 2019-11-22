package structure.proxy.remote.rmi.base;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 21:09
 * @description : 接口
 * @modified By :
 */
public interface IHello extends Remote {

    /**
     * 调用接口
     * @param message 消息
     * @return 返回内容
     * @throws RemoteException 远程调用异常
     */
    public String sayHello(String message) throws RemoteException;

}
