package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindTheGreatesNumber {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("C:\\Users\\adam.n\\Downloads\\dataset_91007.txt"));
            int largest = file.nextInt();

            while (file.hasNextInt()) {
                int number = file.nextInt();

                if (number > largest) largest = number;

            }

            file.close();

            System.out.println(largest);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
