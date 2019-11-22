package structure.proxy.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 20:56
 * @description : 代理查询类
 * @modified By :
 */
public class ProxySearch implements Searcher {
    private RealSearcher real = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;


    @Override
    public String doSearch(String userId, String keyword) {
        if (this.validator(userId)) {
            String result = real.doSearch(userId, keyword);
            this.log(userId);
            return result;
        } else {
            return null;
        }
    }

    private void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }

    private boolean validator(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }
}
