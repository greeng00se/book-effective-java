package greeng00se.effectivejava.chapter03.item17;

import java.math.BigInteger;

public class SafeInstance {

    public static BigInteger safeInstance(BigInteger val) {
        return val.getClass() == BigInteger.class ?
                val : new BigInteger(val.toByteArray());
    }
}
