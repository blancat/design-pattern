package delegate;

/**
 * Created by ysf on 2018/11/9.
 */
public class Dispatcher implements IExecute {

    private IExecute execute;

    public Dispatcher(IExecute execute) {
        this.execute = execute;
    }

    // 委派者不是自己做事情，而是根据情况把事情分发给别人
    public void doing() {
        execute.doing();
    }
}
