package slajd3średnie;

import java.util.Arrays;

public class Slajd3Średnie {
    public static void main(String[] args) {
        Object[] object = new Object[] {1, "bob", 4.11f, false, 'x'};
        for (Object element : object) System.out.println(element);
        object = swap(object, 1, 2);
        System.out.println();
        for (Object element : object) System.out.println(element);
    }

    public static Object[] swap(Object[] tab, int firstIndex , int secondIndex) {
        Object[] tabela = Arrays.copyOf(tab, tab.length);
        tabela[firstIndex] = tab[secondIndex];
        tabela[secondIndex]=tab[firstIndex];
        return tabela;
    }
}
