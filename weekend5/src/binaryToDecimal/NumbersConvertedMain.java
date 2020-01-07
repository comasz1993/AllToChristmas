package binaryToDecimal;

import java.util.Scanner;

public class NumbersConvertedMain {
    public static void main(String[] args) {
        NumbersConverter nc = new NumbersConverter();
        Scanner scanner = new Scanner(System.in);
        boolean zgoda=true;
        do {
            System.out.println("Podaj liczbę binarną: ");
            String binaryNumber=scanner.nextLine();
            System.out.println(nc.binaryToDecimal(binaryNumber));
            System.out.println("Czy raz jeszcze? y / n");
            String choice=scanner.nextLine();

            if(choice.equals("n")) zgoda=false;
            System.out.println(zgoda);
        }

        while(zgoda);
    }
}
