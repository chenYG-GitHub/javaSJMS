package structure.proxy.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 20:54
 * @description : 具体查询实现
 * @modified By :
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("用户：[" + userId + "]使用了关键字[" + "]查询信息");
        return "返回查询结果";
    }
}
