package day2training;

import java.util.Scanner;

public class Day2Training {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("podaj liczbe całkowitą");
        int a=scanner.nextInt();
        System.out.println(a);
        if (a==0) System.out.println("Nie będę liczyć");
        else if (a>11 && a<100) {
            int wynik = 3 + 2 * (a - 8) / 2 * a;
            System.out.println(wynik);
        }
        else System.out.println("Błędny zakres, akceptowalne wartości: 0-99");

        //liczenie potęgi:
            int second = 3;
            double power = Math.pow(a, second);
            System.out.println("Liczba " + a + " podniesiona do potęgi " + second + " wynosi " + power);
    }
}
