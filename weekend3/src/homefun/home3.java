package homefun;

public class home3 {

    protected int base;

    public home3(int base) {
        this.base = base;
    }

    public int generate() {
        return base + 11;
    }
}

class NumberGenerator extends home3 {


    public NumberGenerator(int base) {
        super(base);
    }

    @Override
    public int generate() {

        return super.generate() + getNumber();
    }


    protected int getNumber() {
        return this.base - 7;
    }
}

class MagicNumberGenerator extends NumberGenerator {


    public MagicNumberGenerator(int base) {
        super(base);
    }

    @Override
    protected int getNumber() {
        return this.base + 7;
    }
}
