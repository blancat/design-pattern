package factory.simple_factory;

/**
 * Created by ysf on 2018/11/8.
 */
public class Factory {

    public static Icar createCar(String type) {
        if (type.equals("bmw")) {
            return new BMW();
        } else if (type.equals("benz")) {
            return new Benz();
        } else if (type.equals("jeep")) {
            return new Jeep();
        } else {
            return null;
        }
    }
}
