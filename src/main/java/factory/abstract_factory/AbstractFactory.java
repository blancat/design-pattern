package factory.abstract_factory;

/**
 * Created by ysf on 2018/11/8.
 * 超级工厂，里面可能可以创建鼠标，也可以创建键盘等
 */
public abstract class AbstractFactory {

    public abstract Mouse createMouse();

    public abstract Keybo createKeybo();

}
