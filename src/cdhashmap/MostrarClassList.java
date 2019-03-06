package cdhashmap;

public class MostrarClassList {

    public static void mostrar(ClassList lista) {

        int index = 0;
        for (String s : lista.miLista) {
            System.out.println((index++) + ": " + s);
        }

    }
}
