package cdhashmap;

import java.util.ArrayList;

public class ClassList implements InterfaceList {

    ArrayList<String> miLista = new ArrayList<String>();

    public void putElement(String ele) {
        miLista.add(ele);
    }

    public void getElement(int index) {
        miLista.get(index);
    }

}
