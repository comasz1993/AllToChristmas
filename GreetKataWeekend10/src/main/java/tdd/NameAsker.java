package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameAsker {

    public List<String> ask() {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String name = "";
        while(!(name = scanner.next()).equals("koniec")) {
            names.add(name);
        }

        return names;
    }
}
