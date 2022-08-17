package observer;

public class ObserverTest {

    public static void main(String[] args) {
        Observer baiduObserver = new BaiduObserver();
        Observer sinaObserver = new SinaObserver();
        WeatherCenter weatherCenter = new WeatherCenter();
        weatherCenter.registerObserver(baiduObserver);
        weatherCenter.registerObserver(sinaObserver);
        weatherCenter.registerObserver(new SogouObserver());
        weatherCenter.updateTemp(36.7f);
    }
}
