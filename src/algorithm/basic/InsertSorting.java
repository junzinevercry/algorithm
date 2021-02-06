package algorithm.basic;

import algorithm.share.Tools;

public class InsertSorting {
    public static void main(String[] args) {
        int[] array = Tools.getArray(20);
        Tools.print(array);
        sort(array);
        Tools.print(array);
    }

    static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    Tools.swap(array, j, j - 1);
                }
            }
        }
    }

}
