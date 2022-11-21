package implement;

import java.util.ArrayList;
import java.util.List;

import interfaces.InterfaceSet;

public class Set implements InterfaceSet{
    private List<String> list = new ArrayList<>();

    @Override
    public void add(String str) {
        list.add(str);
    }

    @Override
    public List<String> getList() {
        return list;
    }
}
