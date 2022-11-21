package sets;

import java.util.List;
import decorator.SetDecorator;
import interfaces.InterfaceSet;


public class RealWorldSetDecorator extends SetDecorator{

    public RealWorldSetDecorator(InterfaceSet decoratedSet) {
        super(decoratedSet);
    }
    
    @Override
    public void add(String str) {
        decoratedSet.add(str);
    }

    @Override
    public void print() {
        System.out.println(decoratedSet.getList());
    }

    public List<String> getList() {
        return decoratedSet.getList();
    }
 
}
