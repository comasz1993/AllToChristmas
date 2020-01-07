package language;

import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private List<Language> language=new ArrayList<>();

    public Person (Language language) {
        this.language.add(language);
    }

    public void learn (Language language) { // ma przelatywac po liscie
        this.language.add(language);
    }

//    public List<String> sayHello() {
//        List<String> witanie = new ArrayList<>();
//        for (Language jezyk : language) witanie.add(jezyk.hello());
//        return witanie;
//    }

    public void sayHello() {
        String wszyscy[]=new String[language.size()];
        String hejo="";

        for (int i = 0; i < language.size(); i++) {
            wszyscy[i]=language.get(i).hello();
            hejo+=wszyscy[i]+ " ";
        }
        System.out.println(hejo);
    }
}


