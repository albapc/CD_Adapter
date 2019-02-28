package cdhashmap;

public class CDHashMap {

    public static void main(String[] args) {

//        ClassList list = new ClassList();
//
//        list.putElement("Uno");
//        list.putElement("Dos");
//        list.putElement("Tres");
//        
//        MostrarClassList.mostrar(list);
        ClassHash hash = new ClassHash();

        hash.putValue(10, "uno");
        hash.putValue(11, "dos");
        hash.putValue(12, "tres");

        Hash2List miHash2List = new Hash2List(hash);

        MostrarClassList.mostrar(miHash2List);

    }

}
