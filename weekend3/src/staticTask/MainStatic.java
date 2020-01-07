package staticTask;

public class MainStatic {
    public static void main(String[] args) {
        int v=Example.staticValue;
        Example ex=new Example();
        int v2=ex.nonStaticValue;
        int v3=ex.staticValue; //można również użyć na obiekcie daną statyczną
    }
}
