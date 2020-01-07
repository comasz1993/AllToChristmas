package slajd4proste;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Slajd4Proste {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

        lista.add(5);

        for ( int ele : lista) System.out.println(ele);
        lista = swap(lista, 1, 5);
        System.out.println();
        for ( int ele : lista) System.out.println(ele);
    }

    public static List swap(List lista, Integer firstElement, Integer secondElement) {
        ListIterator<Integer> iterator = lista.listIterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == firstElement) {
                iterator.set(secondElement);
            }
            else if (next == secondElement) {
                iterator.set(firstElement);
            }
        }
        return lista;
    }
}
