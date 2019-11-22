package structure.proxy.remote.rmi.client;

import structure.proxy.remote.rmi.base.IHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String args[]) {
        try {
            // 填写服务器ip
            IHello rhello = (IHello) Naming.lookup("rmi://127.0.0.1:8888/RHello");
            System.out.println(rhello.sayHello("Erich"));
        } catch (NotBoundException e) {
        } catch (MalformedURLException e) {
            e.printStackTrace();
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}