package algorithm.basic;


import algorithm.share.Tools;

/**
 * <h3>Bubble Sort (Stable）</h3>
 * <p>
 * Time Complexity (Best)   O(n)
 * Time Complexity (Avg)    O(n^2)
 * Time Complexity (Worst)  O(n^2)
 * <p>
 * Space Complexity         O(1)
 */
public class BubbleSorting {

    public static void main(String[] args) {
        int[] array = Tools.getArray(20);
        sort(array);
        Tools.print(array);
    }

    /**
     * seldom using by very slow
     *
     * @param array
     */
    static void sort(int[] array) {
        //  array size for each loop
        for (int i = array.length - 1; i > 0; i--) {
            // compare range
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    Tools.swap(array, j, j + 1);
                }
            }
        }
    }
}
