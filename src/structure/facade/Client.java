package structure.facade;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/18 16:54
 * @description : 外观模式客户端测试类
 * @modified By :
 */
public class Client {
    public static void main(String[] args){
        EncryptFacade facade = new EncryptFacade();
        facade.fileEncrypt("src//structure//facade//src.txt","des.txt");
    }
}
