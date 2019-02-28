package cdhashmap;

import java.util.Iterator;
import java.util.Map;

public class Hash2List extends ClassList {

    //ADAPTER
    public Hash2List(ClassHash hashAconvertir) {
//        recorre el hash2list y lo añade al Arraylist
        Iterator t = hashAconvertir.miHash.keySet().iterator();
        while (t.hasNext()) {
            miLista.add(hashAconvertir.miHash.get(t.next()));
        }

        //para que nos muestre las keys y values
//        Iterator t = hashAconvertir.miHash.entrySet().iterator();
//        while (t.hasNext()) {
//            Map.Entry entry = (Map.Entry) t.next();
//            Integer key = (Integer) entry.getKey();
//            String value = (String) entry.getValue();
//            System.out.println(key + ": " + value);
    }

}

//}
