package nmn.geeks.array;

import java.math.BigInteger;

/**
 * Created by naman.nigam on 22/01/17.
 */
public class ReplaceCapitals {

    /**
     * String str = "Happy OLD days are HERE again" replace all capital words with "abc"
     * output would be as "Happy abc days are abc again"
     * @param str
     * @return
     */
    public static String replaceCaps(String str) {
        str = str.replaceAll("(\\b*)[A-Z]+(\\b*)", "$1abc$2");
        return str;
    }

}