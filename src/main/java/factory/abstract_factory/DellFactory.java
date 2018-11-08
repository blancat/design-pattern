package factory.abstract_factory;

/**
 * Created by ysf on 2018/11/8.
 */
public class DellFactory extends AbstractFactory {
    public Mouse createMouse() {
        return new DellMouse();
    }

    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
