package main;

import java.util.Random;

import implement.ConcreteObservable;
import implement.ConcreteObserver;

public class Main {

    public static int[][] RandomFrame() {
        int[][] RandFrame = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < RandFrame.length; i++) {
            for (int j = 0; j < RandFrame.length; j++) {
                RandFrame[i][j] = random.nextInt(0, 2);
            }
        }
        return RandFrame;
    }

    public static void main(String[] args) {
        int[][] frame = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        ConcreteObservable things = new ConcreteObservable();
        ConcreteObserver observer = new ConcreteObserver("Никита", things);
        things.setNewsChurch(frame);
        things.removeObserver(observer);//отключили мониторинг кадра
        things.notifyObservers();//наблюдатель ничего не выводит
        things.registerObserver(observer);//теперь включим мониторинг кадра
        things.notifyObservers();//наблюдатель выведет информацию о движении в кадре
    }
}
