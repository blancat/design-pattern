package factory.simple_factory;

/**
 * Created by ysf on 2018/11/8.
 */
public class Main {

    public static void main(String[] args) {
        Icar benz = Factory.createCar("benz");
        benz.getCar();
        Icar bmw = Factory.createCar("bmw");
        bmw.getCar();
    }
}
