package proxy.jingtai;

/**
 * Created by ysf on 2018/11/8.
 */
public class ProxySubject implements Invoke {
    private Invoke invoke;

    public ProxySubject(Invoke invoke) {
        this.invoke = invoke;
    }

    public void invoke() {
        beforeInvoke();
        invoke.invoke();
        afterInvoke();
    }

    private void beforeInvoke() {
        System.out.println("before invoke");
    }

    private void afterInvoke() {
        System.out.println("after invoke");
    }
}
