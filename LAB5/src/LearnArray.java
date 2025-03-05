import java.util.Arrays; //pointer

public class LearnArray {

    public static int sum(int[] numbers) {
        System.out.println("numbers = " + Arrays.toString(numbers));
        numbers [0] = 20;
        return 0;
    }
    public static void main(String[] args) {
        int[] prices;

        prices = new int[3];

        LearnArray.sum(prices); //sumของLearnArray
        System.out.println("prices = " + Arrays.toString(prices));
    }
}
