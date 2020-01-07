package foreach;

import java.util.Scanner;

public class ForEachMain2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbersNo;
        int minValue=1;
        int maxValue=5;
        do {
            System.out.printf("Wprowadz ilosc liczb z zakresu od %d do %d\n", minValue, maxValue);
            numbersNo=scanner.nextInt();
        } while (numbersNo>maxValue || numbersNo<minValue);

        int[] tab=new int[numbersNo];
        int suma=0;

        String result= ""; // WAŻNE, dzięki pustym czudyslowom string jest zdefiniowany

        for(int i=0; i<tab.length; i++) {
            System.out.println("Wprowadz liczbę nr: " + (i+1));
            tab[i]=scanner.nextInt();
            System.out.println(tab[i]);
            suma=suma+tab[i]; // lub sum+=tab[i];
            if(i==tab.length-1) {
                result+=tab[i]+"=";
            }
            else {
                result+=tab[i]+"+";
            }
        }

        result+=suma;
        System.out.println(result);

        scanner.nextLine(); // WAŻNA LINIJKA !! przy pobieraniu stringa pozwoli nam nie zaciągać poprzedniej linijki

        System.out.print(tab[0]);
        for(int i=1; i<tab.length;i++){
            System.out.print("+" + tab[i]);}
        System.out.println("=" + suma);

//zadanie 3 i 4
        String[] imiona=new String[3];

        for(int i=0; i<imiona.length; i++) {
           System.out.println("Wprowadz imię nr: " + (i + 1));
           imiona[i] = scanner.nextLine();
           System.out.println(imiona[i]);
        }

        String namesText="";  //definiuje nam pustego stringa
        for (String currentName : imiona)
        {
            if (currentName.length()<5)
            namesText+=currentName + ", ";
        }
        namesText=namesText.substring(0, namesText.length()-2); // SUBSTRING to funkcja , która ucina nam litery z danego tekstu
        System.out.println(namesText);
    }
}
