package testy1;

public class WordIsToLongException extends IllegalArgumentException {
    public WordIsToLongException(String s) {
        super(s);
    }
}
