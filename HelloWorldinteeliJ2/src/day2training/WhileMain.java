package day2training;

import java.util.Scanner;

public class WhileMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        //while (i++<2) {
        //System.out.println("Podaj produkt: ");
        //String produkt = scanner.nextLine();


        int suma = 0;
        while (i ++ < 2){
            System.out.println("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            if(liczba>10){
            suma = suma + liczba;}
        }
        System.out.println(suma);


        String slowo;
        while(slowo!="koniec")
        {
            System.out.println("Podaj produkt: ");
            slowo = scanner.nextLine();
            System.out.println(slowo);
        }
    }
}

