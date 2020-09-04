import java.util.Arrays;

public class DostoyevskiyCalculator {

    public long calculateSmallestDebt(long[] n) {
        long smallest = 1;
        long sum = 0;
        long current;

        Arrays.sort(n);

        for(int i = 0; i < n.length; i++) {
            current = n[i];

            if (sum + 1 < current) {
                smallest = sum + 1;
                break;
            }
            if (i == n.length - 1) {
                smallest = sum + current + 1;
                break;
            }

            sum += current;
        }

        return smallest;
    }
}
