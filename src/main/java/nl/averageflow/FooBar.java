package nl.averageflow;


public final class FooBar {
    public static int addThree(final int x) {
        return x + 3;
    }

    public static String customConcat(final String x, final String y) {
        return "%s%s".formatted(x, y);
    }
}
