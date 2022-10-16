/**
 * Create a method int[] findSum(int[] arr, int n) that takes an integer array arr and returns an array of
 * the two integer elements that add up to integer n.
 */
public class FindSum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 3;
        int[] values = null;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            System.out.println("outerloop");
            if (values != null) {
                break;
            }
            for (int j = 1; j < numbers.length; j++) {
                System.out.println("inner loop");
                int adjcentNumber = numbers[j];
                int sumValue = currentNumber + adjcentNumber;
                if (sumValue == sum) {
                    values = new int[2];
                    values[0] = currentNumber;
                    values[1] = adjcentNumber;
                    break;
                }
            }

        }

        System.out.println("values " + values[0] + " and " + values[1]);

    }
}
