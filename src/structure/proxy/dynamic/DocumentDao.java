package structure.proxy.dynamic;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:30
 * @description : 文档Dao接口
 * @modified By :
 */
public interface DocumentDao {
    /**
     * 根据文档编号删除文档
     * @param documentId 文档编号
     * @return 删除是否成功
     */
    Boolean deleteDocumentById(String documentId);

}
