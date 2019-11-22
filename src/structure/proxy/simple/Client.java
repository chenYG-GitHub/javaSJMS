package structure.proxy.simple;

import basic.XMLUtil;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 20:59
 * @description : 代理模式测试客户端
 * @modified By :
 */
public class Client {

    public static void main(String[] args){
        Searcher searcher = (Searcher) XMLUtil.getBean("SimpleProxy");
        String result = searcher.doSearch("杨过", "玉女心经");
        if (result != null) {
            System.out.println(result);
        }
    }

}
