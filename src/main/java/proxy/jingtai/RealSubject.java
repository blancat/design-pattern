package proxy.jingtai;

/**
 * Created by ysf on 2018/11/8.
 */
public class RealSubject implements Invoke {
    public void invoke() {
        System.out.println("real subject invoke method");
    }
}
