package homefun;

import javax.swing.*;

public class ConstantsAndUtilities {
    public static void main(String[] args) {
        home3 generator = new MagicNumberGenerator(10);
        System.out.println(generator.generate());
    }
}
