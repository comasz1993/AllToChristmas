package calculator;

public class StaticCalculator {
    public static int add (int a, int b) {
        return a+b;
    }

    public static int sub(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) throws ZeroDividedException {
    if (b==0)
        throw new ZeroDividedException("You can not divide by zero"); //po wpisaniu podswietla nam na czerwowo i klikamy alt+enter, aby dodał nam powyższą frazę throws...
        return a/b;
    }

    public static int rest (int a, int b) {
        if (b==0) {
            System.out.println("liczba równa 0");
            return -1;
        }
        return a%b;
    }
}
