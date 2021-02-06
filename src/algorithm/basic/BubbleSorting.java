package algorithm.basic;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = {6, 1, 9, 3, 5, 2, 4, 7, 8, 0};
        sort(array);
        print(array);
    }

    static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    static void print(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    static void swap(int[] array, int before, int after) {
        int temp = array[before];
        array[before] = array[after];
        array[after] = temp;
    }
}
