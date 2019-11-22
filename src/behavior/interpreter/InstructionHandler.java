package behavior.interpreter;

import java.util.Stack;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/16 21:32
 * @description : 指令处理类
 * @modified By :
 */
public class InstructionHandler {
    private AbstractNode node;

    public void handler(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        Stack<AbstractNode> stack = new Stack<>();

        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            if ("and".equalsIgnoreCase(words[i])) {
                left = stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(DirectionNode.Direction.find(word1));
                String word2 = words[++i];
                action = new ActionNode(ActionNode.Action.find(word2));
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction,action,distance);
                stack.push(new AndNode(left,right));
            } else {
                String word1 = words[i];
                direction = new DirectionNode(DirectionNode.Direction.find(word1));
                String word2 = words[++i];
                action = new ActionNode(ActionNode.Action.find(word2));
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction,action,distance);
                stack.push(left);
            }
        }
        this.node = stack.pop();
    }

    public String output(){
        return node.interpret();
    }

}
