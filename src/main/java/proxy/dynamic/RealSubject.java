package proxy.dynamic;

/**
 * Created by ysf on 2018/11/8.
 */
public class RealSubject implements Subject {
    public void rent() {
        System.out.println("i want to rent my house");
    }

    public void hello(String s) {
        System.out.println("hello " + s);
    }
}
