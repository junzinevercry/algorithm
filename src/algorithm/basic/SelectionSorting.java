package algorithm.basic;

import algorithm.share.Tools;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] array = Tools.getArray(20);
        sort(array);
        Tools.print(array);
    }

    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    Tools.swap(array, j, i);
                }
            }
        }
    }

}
