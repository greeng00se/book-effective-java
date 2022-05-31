package greeng00se.effectivejava.chapter03.item17;

public class PrivateComplex {
    private final double re;
    private final double im;

    private PrivateComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static PrivateComplex valueOf(double re, double im) {
        return new PrivateComplex(re, im);
    }
}
