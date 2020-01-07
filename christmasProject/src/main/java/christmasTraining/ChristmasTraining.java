package christmasTraining;

import com.sun.source.tree.Tree;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ChristmasTraining {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 2; i < 15; i++) {
            boolean pierwsza = true;
            for (int j = 2; j < 15; j++) {
                if (i == j) break;
                if (i % j == 0) {
                    pierwsza = false;
                    break;
                }
            }
            if (pierwsza == true) lista.add(i);
        }

        System.out.println(lista.isEmpty());
        for (Integer element : lista) System.out.print(element.toString() + " ");
        System.out.println();

        Stack<String> stos = new Stack<>();

        stos.push("olaf");
        stos.push("bolek");

        List<String> list2 = new ArrayList<>();

        while(!stos.isEmpty()) list2.add(stos.pop());

        // for (String imie : stos) list2.add(imie); <-- to przypisanie nie zadziała
        for (String imie : list2) System.out.println(imie);

    }
}
