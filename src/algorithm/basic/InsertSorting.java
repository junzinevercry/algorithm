package algorithm.basic;

import algorithm.share.Tools;

/**
 * <h3>Insert Sort (Stable）</h3>
 * <p>
 * Time Complexity (Best)   O(n)
 * Time Complexity (Avg)    O(n^2)
 * Time Complexity (Worst)  O(n^2)
 * <p>
 * Space Complexity         O(1)
 */
public class InsertSorting {
    public static void main(String[] args) {
        int[] array = Tools.getArray(20);
        Tools.print(array);
        sort(array);
        Tools.print(array);
    }

    /**
     * fit for almost in sequence array
     *
     * @param array
     */
    static void sort(int[] array) {
        // compare times / looping range
        for (int i = 1; i < array.length; i++) {
            // compare from i to beginning
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    Tools.swap(array, j, j - 1);
                }
            }
        }
    }
}
