package nmn.geeks.array;

import java.math.BigInteger;

/**
 * Created by naman.nigam on 22/01/17.
 */
public class IsPrime {

    public static boolean isPrime(int n) {
        return !new String(new char[n]).matches(".?|(..+?)\\1+");
    }

//    public boolean isProbablePrime(int n) {
//        return BigInteger.isProbablePrime(n);
//    }

}