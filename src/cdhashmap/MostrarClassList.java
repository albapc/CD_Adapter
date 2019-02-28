package cdhashmap;

public class MostrarClassList {

    public static void mostrar(ClassList lista) {

//        for (int i = 0; i < lista.lista.size(); i++) {
//            JOptionPane.showMessageDialog(null, lista.lista.get(i));
        int index = 0;
        for (String s : lista.miLista) {
            System.out.println((index++) + ": " + s);
        }

    }
}
