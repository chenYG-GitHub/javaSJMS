package structure.facade;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/18 16:52
 * @description : 加密外观类，充当外观类
 * @modified By :
 */
public class EncryptFacade {

    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String oFileName, String iFileName) {
        String plainStr = reader.read(oFileName);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, iFileName);
    }
}
