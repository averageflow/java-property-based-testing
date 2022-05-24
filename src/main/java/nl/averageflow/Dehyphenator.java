package nl.averageflow;

import java.util.Objects;

public class Dehyphenator {
    public static final int INVALID_ZIPCODE_VALUE = -999;

    public static int dehyphenZipToInt(final String zipcode, int radix) {
        final String stripped = zipcode.replace("-", "");
        return Integer.parseInt(stripped, radix);
    }

     public static int dehyphenZipToInt2(final String zipcode, int radix) {
        if (Objects.equals(zipcode, "")) {
            return INVALID_ZIPCODE_VALUE;
        }

        final String stripped = zipcode.replace("-", "");
        return Integer.parseInt(stripped, radix);
    }

    public static int dehyphenZipToInt3(final String zipcode, int radix) {
        if (Objects.equals(zipcode, "")) {
            return INVALID_ZIPCODE_VALUE;
        }

        final String stripped = zipcode.replace("-", "");

        try {
            return Integer.parseInt(stripped, radix);
        } catch (NumberFormatException e) {
            return INVALID_ZIPCODE_VALUE;
        }
    }
}
