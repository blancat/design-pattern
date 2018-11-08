package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ysf on 2018/11/8.
 */
public class ProxySubject implements InvocationHandler {

    private Object subject;
    public ProxySubject(Object subject) {
        this.subject = subject;
    }

    /**
     * @param proxy 被代理的对象
     * @param method 代理对象的method
     * @param args 代理对象的方法参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        method.invoke(subject, args);
        System.out.println("after invoke");
        return null;
    }
}
