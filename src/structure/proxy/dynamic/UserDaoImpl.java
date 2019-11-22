package structure.proxy.dynamic;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:28
 * @description : 用户Dao接口实现
 * @modified By :
 */
public class UserDaoImpl implements UserDao {
    @Override
    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("杨过")) {
            System.out.println("查询[" + userId + "]成功");
            return true;
        } else {
            System.out.println("查询[" + userId + "]失败");
            return false;
        }
    }
}
