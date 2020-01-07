package testy1;

public class Calculator {

    public int add(int a, int b) {
        return Math.addExact(a,b);
    }

    public int divide (int a, int b) {
        if (b==0) {
            throw new IllegalArgumentException("Nie dziel przez 0 !");
        }
        return a/b;
    }

    public static void main(String[] args) {

        System.out.println(new Object());
        Calculator calculator = new Calculator();

        try {
            int divide = calculator.divide(10, 2);
            System.out.println(divide);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

