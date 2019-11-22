package behavior.interpreter;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/16 21:18
 * @description : 方向节点类，充当非终结符表达式
 * @modified By :
 */
public class DirectionNode extends AbstractNode {

    public enum Direction {
        /** 向上，向下，向左，向右 */
        UP("向上"),DOWN("向下"),LEFT("向左"),RIGHT("向右")
        ;
        private String name;

        Direction(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static Direction find(String name) {
            for (Direction direction : Direction.values()) {
                if (direction.name().equalsIgnoreCase(name)) {
                    return direction;
                }
            }
            return null;
        }
    }

    private Direction direction;

    public DirectionNode(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        return direction.getName();
    }
}
