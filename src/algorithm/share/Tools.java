package algorithm.share;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tools {
    public static void print(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    public static int[] getArray(int len) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            boolean start = true;
            while (start) {
                int currentNumb = Math.abs(new Random().nextInt(len + 1));
                if (Arrays.stream(array).anyMatch(currenti -> currenti == currentNumb)) {
                    continue;
                } else {
                    array[i] = currentNumb;
                    start = false;
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int before, int after) {
        int temp = array[before];
        array[before] = array[after];
        array[after] = temp;
    }

}
