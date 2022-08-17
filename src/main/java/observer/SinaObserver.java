package observer;

public class SinaObserver implements Observer{
    public void update(float temperature) {
        System.out.println("新浪更新了温度" + temperature + "°");
    }
}
