package factory.interface_factory;

/**
 * Created by ysf on 2018/11/8.
 */
public class BenzFactory implements CarFactory {

    public Benz getCar() {
        return new Benz();
    }

}
