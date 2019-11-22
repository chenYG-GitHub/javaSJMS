package behavior.mediator;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/15 21:49
 * @description : 抽象组件类，充当抽象同事
 * @modified By :
 */
public abstract class BaseComponent{

    protected ConcreteMediator mediator;

    public void setMediator(ConcreteMediator mediator) {
        this.mediator = mediator;
    }

    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();

}
