package structure.proxy.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 20:49
 * @description : 身份验证类
 * @modified By :
 */
public class AccessValidator {

    public boolean validate(String userId) {

        System.out.println("在数据库中验证用户[" + userId + "]是否为合法用户?");

        if (userId.equalsIgnoreCase("杨过")) {
            System.out.println("[" + userId + "]验证通过");
            return true;
        } else {
            System.out.println("[" + userId + "]验证失败");
            return false;
        }

    }

}
