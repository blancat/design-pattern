package factory.interface_factory;

/**
 * Created by ysf on 2018/11/8.
 */
public class BmwFactory implements CarFactory {

    public BMW getCar() {
        return new BMW();
    }
}
