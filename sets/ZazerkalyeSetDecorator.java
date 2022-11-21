package sets;

import java.util.ArrayList;
import java.util.List;
import decorator.SetDecorator;
import interfaces.InterfaceSet;

public class ZazerkalyeSetDecorator extends SetDecorator{

    public ZazerkalyeSetDecorator(InterfaceSet decoratedSet) {
        super(decoratedSet);
    }

    @Override
    public void add(String str) {
        decoratedSet.add(str);
    }

    @Override
    public void print() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < getSizeList(); i++) {
            String value = decoratedSet.getList().get(i);
            list.add(Zazerkalye(value));
        }
        System.out.println(list);
    }

    public List<String> getList() {
        return decoratedSet.getList();
    }

    private String Zazerkalye(String normStr) {
        String newString = "";
        for (int i = 0; i < normStr.length(); i++) {
            if(normStr.charAt(i) == ' ') {
                for (int j = i-1; j >= 0; j--) {
                    if(normStr.charAt(j) == ' ')  break;
                    newString += normStr.charAt(j);
                }
                newString += ' ';
            }
            if(normStr.charAt(i) == '\n') {
                for (int j = i-1; j >= 0; j--) {
                    if(normStr.charAt(j) == ' ')  break;
                    newString += normStr.charAt(j);
                }
            }
            
        }
        return newString;
    }

    private int getSizeList() {
        return decoratedSet.getList().size();
    }
}
