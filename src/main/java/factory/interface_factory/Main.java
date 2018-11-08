package factory.interface_factory;

/**
 * Created by ysf on 2018/11/8.
 */
public class Main {

    public static void main(String [] args) {
        BenzFactory benzFactory = new BenzFactory();
        BmwFactory bmwFactory = new BmwFactory();
        Benz benz = benzFactory.getCar();
        BMW bmw = bmwFactory.getCar();
        benz.run();
        bmw.run();
    }
}
