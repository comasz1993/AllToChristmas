package tables;

public class TablesMain {
    public static void main(String[] args) {

//        int[] numbers = {3, 4, 5, 6, 7, 8}; // lista inicjalizacyjna
//        int max = Integer.MIN_VALUE; // ogromnie niska liczba ujemna, nie da się jej zareprezentować w pamięci komputera
//        int maxIndex = -1; // kiedy wyrzuciloby nam jakis blad to gdy zwróci -1 będziemy wiedzieć, że bląd
//        int min = Integer.MAX_VALUE;
//        int minIndex = -1;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (max < numbers[i]) {
//                max = numbers[i];
//                maxIndex = i;
//            }
//            if (min > numbers[i]) {
//                min = numbers[i];
//                minIndex = i;
//            }
//        }
//        System.out.println("max: " + max + ", min: " + min); // wyznaczyliśmy największą i najmniejszą wartość
//        System.out.println("index max: " + maxIndex + ", index min: " + minIndex); // wyznaczylismy najwyzszy i najniższy index

        // 2 prostsza metoda:
        int[] numbers = {3, 4, 5, 6, 7, 8}; // lista inicjalizacyjna
        int max = numbers[0]; // przypisujemy do maxa element zerowy
        int maxIndex = 0; // zmieniamy z -1 na 0
        int min = numbers[0];
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {  // zmieniamy z 0 na 1
            if (max < numbers[i]) {
                max = numbers[i];
                maxIndex = i;
            }
            if (min > numbers[i]) {
                min = numbers[i];
                minIndex = i;
            }
        }
            System.out.println("max: " + max + ", min: " + min); // wyznaczyliśmy największą i najmniejszą wartość
            System.out.println("index max: " + maxIndex + ", index min: " + minIndex); // wyznaczylismy najwyzszy i najniższy index
        int suma=0;
        for (int elements : numbers) {
            suma=suma+elements;
        }
        System.out.println("Suma wynosi: " + suma);
        float mianownik=numbers.length;
        System.out.println(numbers.length);
        float srednia=suma/mianownik;
        System.out.printf("Srednia wynosi: %.2f", srednia);
    }

}
