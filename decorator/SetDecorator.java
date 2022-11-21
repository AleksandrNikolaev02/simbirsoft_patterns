package decorator;

import java.util.List;
import interfaces.InterfaceSet;

public abstract class SetDecorator implements InterfaceSet{

    protected InterfaceSet decoratedSet;

    public SetDecorator(InterfaceSet decoratedSet) {
        this.decoratedSet = decoratedSet;
    }

    @Override
    public void add(String str) {
        decoratedSet.add(str);
    }

    @Override
    public List<String> getList() {
        return decoratedSet.getList();
    }

    public void print() {
        System.out.println(decoratedSet.getList());
    }
    
}
