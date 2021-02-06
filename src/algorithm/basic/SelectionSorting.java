package algorithm.basic;

import algorithm.share.Tools;

/**
 * <h3>Selection Sort (Non Stable）</h3>
 * <p>
 * Time Complexity (Best)   O(n^2)
 * Time Complexity (Avg)    O(n^2)
 * Time Complexity (Worst)  O(n^2)
 * <p>
 * Space Complexity         O(1)
 */
public class SelectionSorting {
    public static void main(String[] args) {
        int[] array = Tools.getArray(20);
        sort(array);
        Tools.print(array);
    }

    static void sort(int[] array) {
        // loop source value
        for (int i = 0; i < array.length - 1; i++) {
            // loop target value (all values behind source)
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    Tools.swap(array, j, i);
                }
            }
        }
    }
}
