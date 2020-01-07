package foreach;

import java.util.Scanner;

public class ForEachMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int productsNo=3;
        String[] products=new String[productsNo];
        int counter=0;
        while (counter<productsNo){
            System.out.println("Wprowadź nazwę produktu: ");
            products[counter++]=scanner.nextLine();
        }
        int suma=0;
        int a=0;

        while (a++<3){
            System.out.println("Podaj liczbę: ");
            int b = scanner.nextInt();
            if (b>10) suma+=b;
        }
        System.out.println(suma);

        //Zadanie 4:
        scanner.nextLine();
        String koniec="";
        while (!koniec.equals("koniec")) {
            System.out.println("Podaj ciąg znaków: ");
            koniec=scanner.nextLine();
        }
        System.out.println("Pętla skończona!");

        for (int i=0; i<products.length; i++) {
            System.out.printf("Produkt na %d-tym miejscu: %s\n", i, products[i]);
        }

        for (String currentProduct : products){
            System.out.println("Produkt: " + currentProduct);
        }

    }
}
