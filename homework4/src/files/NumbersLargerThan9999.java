package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumbersLargerThan9999 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("C:\\Users\\adam.n\\Downloads\\dataset_91022.txt"));
            int counter = 0;


            while (file.hasNextInt()) {
                int number = file.nextInt();
                if (number >= 9999) counter++;
            }
            file.close();

            System.out.println(counter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
