package structure.proxy.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 20:53
 * @description : 查询接口
 * @modified By :
 */
public interface Searcher {

    /**
     * 查询
     * @param userId 用户名
     * @param keyword 密码
     * @return 查询结果
     */
    public String doSearch(String userId, String keyword);

}
