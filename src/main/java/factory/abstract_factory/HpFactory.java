package factory.abstract_factory;

/**
 * Created by ysf on 2018/11/8.
 */
public class HpFactory extends AbstractFactory {
    public Mouse createMouse() {
        return new HpMouse();
    }

    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
