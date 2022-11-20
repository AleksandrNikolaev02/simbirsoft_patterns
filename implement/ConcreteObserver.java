package implement;
import interfaces.Observable;
import interfaces.Observer;

public class ConcreteObserver implements Observer{
    private String name;

    public ConcreteObserver(String name, Observable o) {
        this.name = name;
        o.registerObserver(this);
    }

    @Override
    public void update(int[][] news) {
        String str = toString(news);
        if(str == "") System.out.println(name + " не выявил движения в кадре");
        else System.out.println(name + " узнал новость, что в данном кадре есть движения: " + str);
    }

    public String toString(int[][] news) {
        String newStr = "";
        int counter = 0;
        for (int i = 0; i < news.length; i++) {
            for (int j = 0; j < news.length; j++) {
                if(news[i][j] > 0) {
                    newStr += "[" + i + ";" + j + "] ";
                    counter++;
                }
            }
        }
        if(counter > 2) return newStr;
        else return "";
    }
    
}
