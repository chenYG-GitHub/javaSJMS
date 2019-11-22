package structure.proxy.dynamic;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:27
 * @description : 用户DAO接口
 * @modified By :
 */
public interface UserDao {

    /**
     * 更具用户标识查询用户
     * @param userId 用户标识
     * @return 是否查询到
     */
    Boolean findUserById(String userId);

}
