package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherCenter {

    private List<Observer> observerList = new ArrayList<Observer>();

    private Float tempreture;

    public void updateTemp(float temp) {
        this.tempreture = temp;
        notifyObserver();
    }


    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    private void notifyObserver() {
        observerList.forEach(item -> {
            item.update(this.tempreture);
        });
    }
}
