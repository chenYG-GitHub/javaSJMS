package behavior.interpreter;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/16 21:18
 * @description : 动作节点类，充当终结符表达式
 * @modified By :
 */
public class ActionNode extends AbstractNode {

    public enum Action {
        /** 移动，快速移动 */
        MOVE("移动"),RUN("快速移动")
        ;
        private String name;

        Action(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static Action find(String name) {
            for (Action direction : Action.values()) {
                if (direction.name().equalsIgnoreCase(name)) {
                    return direction;
                }
            }
            return null;
        }

    }

    private Action action;

    public ActionNode(Action action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        return action.getName();
    }
}
