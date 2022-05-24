package nl.averageflow;

public class PrimaryZipcodeRange implements Comparable<PrimaryZipcodeRange> {
    public int from;
    public int to;
    public int fromCount = 0;
    public int toCount = 0;

    public PrimaryZipcodeRange(int from, int to) {
        this.from = from;
        this.to = to;
        this.fromCount = 0;
        this.toCount = 0;
    }

    public PrimaryZipcodeRange(int from, int to, int fromCount, int toCount) {
        this.from = from;
        this.to = to;
        this.fromCount = fromCount;
        this.toCount = toCount;
    }

    @Override
    public int compareTo(PrimaryZipcodeRange o) {
        if (from > o.from && to > o.to) {
            return 1;
        } else if (from < o.from && to < o.to) {
            return -1;
        } else {
            return 0;
        }
    }

    public int getFrom() {
        return this.from;
    }

    public int getTo(){
        return this.to;
    }
}
