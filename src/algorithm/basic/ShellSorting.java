package algorithm.basic;

import algorithm.share.Tools;

public class ShellSorting {

    public static void main(String[] args) {
        int[] array = Tools.getArray(20);
        Tools.print(array);
        sort(array);
        Tools.print(array);
    }

    static void sort(int[] array) {
        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i; j < gap - 1; j -= gap) {
                    if (array[j] < array[j - gap]) {
                        Tools.swap(array, j, j - gap);
                    }
                }
            }
        }
    }

}
