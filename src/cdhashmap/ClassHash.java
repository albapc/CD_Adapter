package cdhashmap;

import java.util.HashMap;
import java.util.Map;

public class ClassHash implements InterfaceHash {

    Map<Integer, String> miHash = new HashMap<>();

    public void putValue(Integer key, String value) {
        miHash.put(key, value);
    }

    public String getValue(Integer key) {
        return miHash.get(key);
    }
}
