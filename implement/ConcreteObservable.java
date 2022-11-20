package implement;


import interfaces.Observable;
import interfaces.Observer;
import java.util.List;
import java.util.ArrayList;

public class ConcreteObservable implements Observable{
    private List<Observer> parishioners = new ArrayList<>();
    private int[][] newsChurch;

    public void setNewsChurch(int[][] news) {
        this.newsChurch = news;
    }

    @Override
    public void registerObserver(Observer o) {
        parishioners.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        parishioners.remove(o);
    }

    @Override
    public void notifyObservers() {
        parishioners.forEach(o -> o.update(newsChurch));
    }
    
}
