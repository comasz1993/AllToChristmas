package slajd4proste;

import java.util.*;

public class Slajf4Średnie {
    public static void main(String[] args) {

        Comparator<String> comparator = (o1, o2) -> {
            int length1 = o1.length();
            int length2 = o2.length();

            if (length1 == length2) {
                return o1.compareTo(o2);
            }

            return length1 - length2;
        };

        PriorityQueue<String> names = new PriorityQueue<>(comparator);
        names.offer("dupalolo");
        names.offer("ala");
        names.offer("namaste");

        List<String> list = new ArrayList<>();

        while (!names.isEmpty()) {
            list.add(names.poll());
            // System.out.println(names.poll()); // można dodać zamiennie tę linijkę , a usunąć powyższą list.add oraz poniższy iterator
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
