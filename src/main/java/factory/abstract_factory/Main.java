package factory.abstract_factory;

/**
 * Created by ysf on 2018/11/8.
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory dell = new DellFactory();
        AbstractFactory hp = new HpFactory();
        dell.createKeybo().press();
        dell.createMouse().click();
        hp.createMouse().click();
        hp.createKeybo().press();
    }
}
