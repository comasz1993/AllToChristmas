package slajd5średnie;

import java.util.Stack;

public class Slajd5Średnie {

    public static void main(String[] args) {
        decimalToBinary(422);
    }

    public static void decimalToBinary(int n) {
        if (n==0) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        decimalToBinary(n/2);
        //System.out.print(n%2); // tę liniijkę można używać aby wyświetlić, ale bez dodaniai na stos
        System.out.print(stack.push(n%2));
    }

}
