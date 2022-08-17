public class Test {


    public interface Run {
        public void run();
    }
    public abstract class Car implements Run {
    }
    public abstract class Suv implements Run {
    }

    public class BenzCar extends Car {
        public void run() {
            System.out.println("benz car running");
        }
    }
    public class BenzSuv extends Suv {
        public void run() {
            System.out.println("benz suv running");
        }
    }

    public class BmwCar extends Car {
        public void run() {
            System.out.println("bmw car running");
        }
    }
    public class BmwSuv extends Suv {
        public void run() {
            System.out.println("bmw suv running");
        }
    }

    public abstract class AbstractCarFactory {
        abstract Car createCar();
        abstract Suv createSuv();
    }

    public class BenzFactory extends AbstractCarFactory {
        Car createCar() {
            return new BenzCar();
        }
        Suv createSuv() {
            return new BenzSuv();
        }

    }

    public class BmwFactory extends AbstractCarFactory {
        Car createCar() {
            return new BmwCar();
        }
        Suv createSuv() {
            return new BmwSuv();
        }
    }

    public void testFun() {
        AbstractCarFactory benzFactory = new BenzFactory();
        Car benzCar = benzFactory.createCar();
        Suv benzSuv = benzFactory.createSuv();
        benzCar.run();
        benzSuv.run();
        AbstractCarFactory bmwFactory = new BmwFactory();
        Car bmwCar = bmwFactory.createCar();
        Suv bmwSuv = bmwFactory.createSuv();
        bmwCar.run();
        bmwSuv.run();

    }

    public static void main(String [] args) {

        Test test = new Test();
        test.testFun();
    }
}
