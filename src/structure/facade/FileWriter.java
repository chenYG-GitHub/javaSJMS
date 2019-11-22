package structure.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/18 16:48
 * @description : 文件保存类，充当子系统类
 * @modified By :
 */
public class FileWriter {
    public void write(String encryptStr, String fileName){
        System.out.println("保存密文，写入文件：");
        try(FileOutputStream fos = new FileOutputStream(fileName)){
            fos.write(encryptStr.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
    }

}
