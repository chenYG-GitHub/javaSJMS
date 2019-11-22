package structure.facade;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/18 16:45
 * @description : 数据加密类，充当子系统类
 * @modified By :
 */
public class CipherMachine {
    public String encrypt(String plainTest) {
        System.out.println("数据加密，将明文转换为密文：");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < plainTest.length(); i++) {
            String c = String.valueOf(plainTest.charAt(i) % 7);
            result.append(c);
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
