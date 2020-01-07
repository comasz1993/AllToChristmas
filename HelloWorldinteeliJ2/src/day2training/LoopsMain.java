package day2training;

import java.util.Scanner;

public class LoopsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj produkt: ");
            String produkt = scanner.nextLine();
            //System.out.println("Dodałem do koszyka" + produkt + ", to nasz " + i + " produkt!");
            System.out.printf("Dodałem do koszyka %s, to nasz %d produkt!\n", produkt, i + 1);
        }
        //zadanie 2
        int suma=0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            suma=suma+liczba; //zamiennie można zapisać: suma+ = liczba
        }
        System.out.println(suma);

        //zadanie 3
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Iterator 1: " + i + j);
            }
            System.out.println("Iterator 1: " + i);
        }
        // Zadanie 4 oraz 5
        System.out.println("Podaj ilość znaków, z których kwadrat ma się składać:");
        int ilosc=scanner.nextInt();
        scanner.nextLine();
        System.out.println("A jaki to znak? :) ");
        String znak=scanner.nextLine();

        for (int i=0; i<ilosc; i++) {
            for (int j=0; j<ilosc; j++) {
                System.out.print(znak);
            }
            System.out.println("");
        }
    }
}

