
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int value = 0;
        int index = 0;
        while (index < array.length){
            value += array[index];
            index ++;
        }
        return value;
    }
}
