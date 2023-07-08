import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<RowStrength> rowStrengths = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            int strength = countSoldiers(mat[i]);
            rowStrengths.add(new RowStrength(i, strength));
        }

        Collections.sort(rowStrengths);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowStrengths.get(i).index;
        }

        return result;
    }

    private int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            } else {
                break; // Since soldiers appear before civilians
            }
        }
        return count;
    }

    class RowStrength implements Comparable<RowStrength> {
        int index;
        int strength;

        public RowStrength(int index, int strength) {
            this.index = index;
            this.strength = strength;
        }

        @Override
        public int compareTo(RowStrength other) {
            if (this.strength != other.strength) {
                return Integer.compare(this.strength, other.strength);
            } else {
                return Integer.compare(this.index, other.index);
            }
        }
    }
}
public class KWeakestRows{

}
