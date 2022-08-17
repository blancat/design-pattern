package observer;

public class SogouObserver implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("搜狗获取到了气象中心更新的最新温度：" + temperature);
    }
}
