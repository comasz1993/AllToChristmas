package slajd8i9proste;

public class User {

    private String imie;
    private String nazwisko;
    private String login;
    private String password;
    private String uro;

    public User(String imie, String nazwisko, String login, String password, String uro) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.login=login;
        this.password=password;
        this.uro=uro;
    }

    public boolean checkIfEmpty() {
        if (imie.equals(null) || nazwisko.equals(null)) return false;
        return true;
    }

    public boolean passwordEnough() {
        if (password.length()<8) return false;
        return true;
    }

}
