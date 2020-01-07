package testy1;

public class StupidAddition {

    public int stupidAdd(int a, String b, boolean c) {
        if (c) {
            return a + Integer.parseInt(b);
        }
        return 0;
    }
}
