package delegate;

/**
 * Created by ysf on 2018/11/9.
 */
public class Main {

    public static void main(String [] args) {
        // 委派模式主要是调用的地方分清要分发给哪个执行者

        // 比如这边根据业务情况，去分清具体是要new ExecuteA还是B，然后委派者去调用执行者具体执行
        IExecute execute = new ExecuteA();
        Dispatcher dispatcher = new Dispatcher(execute);
        dispatcher.doing();

    }
}
