package humanenum;

public class HumanMain {
    public static void main(String[] args) {
        Human adam=new Human("Adam", 12, EyeColor.Diamond, HairColor.Pink);
        System.out.println(adam.toString());
        adam=new Human("Filip", 99, EyeColor.Blue, HairColor.Blond);
        System.out.println(adam); // wystarczy wpisac samo słowo adam, aby nam wywowało funkcję toString.
        // Dla funkcji to String tak to działa
        System.out.println(adam.toString());
    }
}
