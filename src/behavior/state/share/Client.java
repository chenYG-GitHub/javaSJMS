package behavior.state.share;

/**
 * @author : chenyg
 * @version : $
 * @date : Created in 2019/11/14 0:16
 * @description :
 * @modified By :
 */
public class Client {

    public static void main(String[] args){
        Switch s1,s2;
        s1 = new Switch("开关1");
        s2 = new Switch("开关2");
        s1.on();
        s2.on();
        s1.off();
        s2.off();

    }


}
