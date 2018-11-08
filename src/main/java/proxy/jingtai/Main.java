package proxy.jingtai;

/**
 * Created by ysf on 2018/11/8.
 */
public class Main {
    public static void main(String [] args) {
        Invoke subject = new RealSubject();
        Invoke proxy = new ProxySubject(subject);
        proxy.invoke();
    }
}
