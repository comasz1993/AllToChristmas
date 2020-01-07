package tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessClass {

    NameAsker nameAsker = new NameAsker();

    public BusinessClass(NameAsker nameAsker) {
        this.nameAsker = nameAsker;
    }


    public String greet(String name) {
        if (name == null || name.length() == 0) return "Hello, my Friend!";
        if (name == name.toUpperCase()) return "HELLO " + name.toUpperCase();
        return "Hello, " + name;
    }

    public String greet(String name1, String name2) {
        if (name1 == null || name2 == null || name1.length() == 0 || name2.length() == 0) return "Hello, my Friends!";
        if (name1 == name1.toUpperCase() || name2 == name2.toUpperCase()) return "HELLO " + name1 + ", " + name2;
        return "Hello, " + name1 + " i " + name2;
    }

    public String greet(String name1, String... names) {
        String greeting = "Hello, " + name1 + ", ";

        List<String> upperList = new ArrayList<>();

        for (int i = 0; i < names.length - 1; i++) {
            if (names[i] == names[i].toUpperCase()) {
                upperList.add(names[i]);
                continue;
            }
            greeting += names[i] + ", ";
        }

        String upper = "";

        for (int i = 0; i < upperList.size(); i++) {
            upper += upperList.get(i) + ", ";
        }

        greeting = greeting.substring(0, greeting.length() - 2) + " and " + names[names.length - 1] +
                ". AND HELLO " + upper.substring(0, upper.length() - 2);

        return greeting;
    }

    public String greetAndSplit(String name1, String... names) {
        String greeting = "Hello, " + name1 + ", ";

        List<String> elements = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {

            String[] split = names[i].split(", ");
            elements.addAll(Arrays.asList(split));
        }

        for (int i=0; i<names.length; i++) {
            greeting+= elements.get(i) + ", ";
        }

        return greeting.substring(0, greeting.length()-2) + " and " + elements.get(elements.size()-1);
    }

    public String sayHello() {
        return "Hello, " + nameAsker.ask();
    }
}
