package humanenum;

public class Human {
    private String name;
    private int age;
    private EyeColor eyeColor;
    private HairColor hairColor;

    public Human(String name, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name=name;
        this.age=age;
        this.eyeColor=eyeColor;
        this.hairColor=hairColor;
    }

    @Override //przeciążamy metodę
    public String toString() {
        return String.format("Cześć, jestem %s, mam %d lat, %s oczy i %s włosy", name, age, eyeColor.name(), hairColor.name());
    }
}
