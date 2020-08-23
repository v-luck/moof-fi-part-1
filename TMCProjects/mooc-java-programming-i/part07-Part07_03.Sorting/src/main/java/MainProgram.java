import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int smallestIndex = array[0];
        for (int number : array) {
            if (number < smallestIndex) {
                smallestIndex = number;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = smallest(array);
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == smallestIndex) {
                return i;
            }

        }
        return -1;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i ++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempIndexValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempIndexValue;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }

}
