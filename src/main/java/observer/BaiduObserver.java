package observer;

public class BaiduObserver implements Observer{
    public void update(float temperature) {
        System.out.println("百度更新了温度" + temperature + "°");
    }
}
