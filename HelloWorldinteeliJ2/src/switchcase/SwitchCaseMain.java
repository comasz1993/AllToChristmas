package switchcase;

import java.util.Scanner;

public class SwitchCaseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr w zakresie 0-1:");
        int number = scanner.nextInt();

        switch (number) {
            case 0:
                System.out.println("!");
                break;
            case 1:
                System.out.println("@");
                break;
            default:
                System.out.println("Inna wartość");
                break;
        }
//zadanie 2
            System.out.println("Podaj słowo");
            Scanner scan = new Scanner(System.in);
            String slowo = scan.nextLine();

            switch (slowo) {
                case "gwiazdka":
                    System.out.println("*");
                    break;
                case "krzyzyk":
                    System.out.println("#");
                    break;
                default:
                    System.out.println("Inna wartość");
            }



    }
}