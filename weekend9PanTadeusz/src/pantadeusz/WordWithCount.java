package pantadeusz;

public class WordWithCount {

    private final String word;
    private int count;

    public WordWithCount(String word) {
        this.word=word;
        count=0;
    }

    public void increment() {
        this.count++;
    }
}
