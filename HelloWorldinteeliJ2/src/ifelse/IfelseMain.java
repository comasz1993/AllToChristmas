package ifelse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfelseMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int number=scanner.nextInt();

        if(number<10)
            System.out.println("mniejsza od 10");
        else if(number==10)
            System.out.println("równa 10");
        else
            System.out.println("większa o 10");

//zadanie 2
        System.out.println("wprowadz liczbe od 0 do 5");
        int a=scanner.nextInt();
        if(a==1) System.out.println("!");
        else if(a==2) System.out.println("@");
        else if(a==3) System.out.println("#");
        else if(a==4) System.out.println("^");
        else if(a==5) System.out.println("%");

        else System.out.println("podano liczbę spoza zakresu");
//zadanie 2b
        switch(a) {
            case 1:
                System.out.println("!");
                break;
            case 2:
                System.out.println("@");
                break;
            default:
                System.out.println("inny typ");
                break;

        }
    }
}
