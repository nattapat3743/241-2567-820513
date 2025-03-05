import java.util.Arrays;

public class MyNumeric {
    public static void main(String[] args) {
        int[] numbers = { 19, 12, 14, 15, 11, 21, 18, 22, 25, 13 };

        SimpleNumeric smn = new SimpleNumeric(numbers);

        System.out.println("All numbers: " + Arrays.toString(numbers));
        System.out.println("#Odd: " + smn.getOddCount());
        System.out.println("#Even: " + smn.getEvenCount());
        System.out.println("Average: " + smn.getAverage());
        System.out.println("OddSummary: " + smn.getOddSummary());
        System.out.println("EvenSummary: " + smn.getEvenSummary());
        System.out.println("Summary: " + smn.getSummary());
    }
}