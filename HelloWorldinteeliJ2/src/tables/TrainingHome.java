package tables;

import java.util.Arrays;
import java.util.Scanner;

public class TrainingHome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int x2=scanner.nextInt();
        int x3=scanner.nextInt();
        int[] tab1=new int[]{x1, x2, x3};
        int y1=scanner.nextInt();
        int y2=scanner.nextInt();
        int y3=scanner.nextInt();
        int[] tab2=new int[]{y1, y2, y3};
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        if (tab1[0]==tab2[0] && tab1[1]==tab2[1] && tab1[2]==tab2[2]) System.out.println("Box 1 = Box 2");
        else if (tab1[0]<=tab2[0] && tab1[1]<=tab2[1] && tab1[2]<=tab2[2]) System.out.println("Box 1 < Box 2");
        else if (tab1[0]>=tab2[0] && tab1[1]>=tab2[1] && tab1[2]>=tab2[2]) System.out.println("Box 1 > Box 2");
        else System.out.println("Incomparable");
    }
}
