package behavior.memento;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 22:23
 * @description : 象棋棋子备忘录管理类，充当负责人
 * @modified By :
 */
public class MementoCaretaker {
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
}
