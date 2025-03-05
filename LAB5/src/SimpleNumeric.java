public class SimpleNumeric {
    public int[] numbers;

    public SimpleNumeric(int[] numbers) {
        this.numbers = numbers;
    }

    public int getOddCount() {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int getEvenCount() {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public double getAverage() {
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public int getSummary() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int getOddSummary() {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public int getEvenSummary() {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}