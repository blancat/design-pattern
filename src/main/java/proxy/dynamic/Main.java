package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by ysf on 2018/11/8.
 */
public class Main {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new ProxySubject(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
        subject.hello("你好");
        subject.rent();
    }
}
