public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greatest = Math.max(number1, number2);
        if (greatest<number3) {
            return number3;
        } else {
            return greatest;
        }

    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
