package tables;

import java.util.Arrays;
import java.util.Scanner;

public class TablesMain2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int maxNumber=scanner.nextInt();
        int[] numbers=new int[maxNumber];
        String numbersText="";
        for(int i=maxNumber-1; i>=0; i--) {
            numbers[i]=i;
            numbersText+=i + ", ";
        }

        System.out.println(numbersText);

// wyznaczamy teraz liczby podzielne przez 2:
        int evenNumbersNo=numbers.length%2==0 ? numbers.length/2 : numbers.length/2 + 1; //rodzaj pętli
        String evenNumbersText="";
        int[] evenNumbers=new int[evenNumbersNo];
        for(int i=0; i<evenNumbers.length; i++) {
            evenNumbers[i] = 2 * i;
            evenNumbersText += evenNumbers[i] + ", ";
        }
        System.out.println(evenNumbersText);
    }

}
