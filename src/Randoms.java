import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected final int min, max;

    protected Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    public int generateNextInt() {
        return random.nextInt(max - min + 1) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return Randoms.this.generateNextInt();
            }
        };
    }
}

