package scannertask;
import java.util.Scanner;

public class ScannerTaskMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj imię");
        String name=scanner.nextLine();
        System.out.println("Witaj " + name);

//zadanie 2
        System.out.println("Podaj 1 liczbę");
        int number1=scanner.nextInt();
        System.out.println("Podaj 2 liczbę");
        int number2=scanner.nextInt();

        System.out.println("Wynik to: " + (number1+number2));
    }
}
