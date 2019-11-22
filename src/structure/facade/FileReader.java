package structure.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/18 16:39
 * @description : 文件读取类，充当子系统类
 * @modified By :
 */
public class FileReader {

    public String read(String fileName) {
        System.out.println("读取文件，获取明文：");
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName)){
            int data;
            while ((data = fis.read()) != -1) {
                sb.append((char) data);
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
        return sb.toString();
    }


}
