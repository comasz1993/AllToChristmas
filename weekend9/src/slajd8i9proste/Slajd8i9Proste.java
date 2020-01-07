package slajd8i9proste;

public class Slajd8i9Proste {
    public static void main(String[] args) {
        User user = new User("adam", "niewia", "adamo", "pass", "20.08");
        System.out.println(user.checkIfEmpty());
        System.out.println(user.passwordEnough());
    }
}
