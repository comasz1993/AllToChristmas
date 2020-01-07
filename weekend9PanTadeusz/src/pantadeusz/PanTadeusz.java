package pantadeusz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PanTadeusz {

    public static void main(String[] args) {
        PanTadeusz panTadeusz = new PanTadeusz();
        String tekstKsiazki = null;

        try {
            tekstKsiazki = panTadeusz.readBook("pantadeusz.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> panTadeuszWords = panTadeusz.clearData(tekstKsiazki);

        System.out.println(panTadeuszWords);

    }

    public List<String> clearData(String bookText) {
        // można splitować nie tylko po znakach, ale również po RegExach

        String[] parsedText = bookText
                .replace(",","")
                .replace(".","")
                .toLowerCase()
                .split(" ");

        return Arrays.asList(parsedText);
    }

    public String readBook (String fileName) throws FileNotFoundException {
        File file = new File("pantadeusz.txt");
        Scanner scanner = new Scanner(file);

        List<String> listOfLines = new ArrayList<>();

        while(scanner.hasNextLine()) {
            listOfLines.add(scanner.nextLine());
        }

        String collect = listOfLines.stream().collect(Collectors.joining(" "));
        return collect;
    }
}
