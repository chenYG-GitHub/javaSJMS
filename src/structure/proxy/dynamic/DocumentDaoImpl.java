package structure.proxy.dynamic;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:31
 * @description : 文档Dao实现
 * @modified By :
 */
public class DocumentDaoImpl implements DocumentDao {
    @Override
    public Boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D01")) {
            System.out.println("删除[" + documentId + "]成功");
            return true;
        } else {
            System.out.println("删除[" + documentId + "]失败");
            return false;
        }
    }
}
