package slajd3proste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Slajd3Proste {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        int[] tabint=new int[5];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < tabint.length; i++) {
            System.out.println("Podaj liczbę: ");
            tabint[i]=scanner.nextInt();
        }

        for (int i = 0; i < tabint.length; i++) {
            String string=String.valueOf(tabint[i]);
            char[] tab=string.toCharArray();
            int sum=0;
            for (int j = 0; j < tab.length; j++) {
                sum+=Character.getNumericValue(tab[j]);
            }
            if (sum==4) list.add(tabint[i]);
        }

        for (int element : list) System.out.println(element);

        int[] stowa = new int[100];

        for (int i = 0; i < 100; i++) {
            stowa[i]=i+1;
        }

        for (int i = 0; i < stowa.length; i++) {
            if(i*i < stowa.length)
            System.out.println(stowa[i*i]);
        }

    }
}
