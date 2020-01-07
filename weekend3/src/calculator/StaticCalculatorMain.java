package calculator;

import java.util.Scanner;

public class StaticCalculatorMain {
    public static void main(String[] args) {
        StaticCalculator.rest(5,0);
        System.out.println(StaticCalculator.add(5, 2));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Co chcesz zrobić? add? divide?");
        String choice=scanner.nextLine();
        int a,b;
        switch(choice) {
            case "divide":
                System.out.println("Insert first number: ");
                a=scanner.nextInt();
                System.out.println("Insert second number: ");
                b=scanner.nextInt();
                try {
                    System.out.println(a + " / " + b + " = " + StaticCalculator.divide(a,b));
                } catch (ZeroDividedException e) {
                    System.out.println(e.getMessage());
                }
                break;
             case "add":
                System.out.println("Insert first number: ");
                a=scanner.nextInt();
                System.out.println("Insert second number: ");
                b=scanner.nextInt();
                System.out.println(a + " + " + b + " = " + StaticCalculator.add(a,b));
                break;
            default:
                System.out.println("Wrong instruction");
        }
    }
}
