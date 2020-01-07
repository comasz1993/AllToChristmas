package taskscalc;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj 1 liczbę:");
        int a=scanner.nextInt();
        System.out.println("Podaj 2 liczbę:");
        int b=scanner.nextInt();
        System.out.println("Suma wynosi: "+ (a+b));
        System.out.println("Różnica wynosi: "+ (a-b));
        System.out.printf("%d+%d=%d\n",a,b,a+b );
        System.out.printf("%d+%d=%d\n",a,b,a-b );

        System.out.println("Teraz wpisz suma lub różnica");
        Scanner scanner1=new Scanner(System.in);
        String znak=scanner1.nextLine();
        //if (znak.equals ("suma")) System.out.println(a+b);
        //else if (znak.equals("różnica")) System.out.println(a-b);
        switch (znak) {
            case "suma":
                System.out.println(a + b);
                break;
            case "różnica":
                System.out.println(a - b);
                break;
            default:
                System.out.println("brak równania");
        }

        if (a%2==0) System.out.println("Liczba jest parzysta"); //okreslenie czy liczba jest parzysta
        else System.out.println("Liczba jest nieparzysta");

    }
}
