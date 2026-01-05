import java.util.Arrays;

public class SquaringAndSorting {
    public static void main(String[] args) {
        int[] l1 = {-7, -4, -1, 2, 3, 6, 10};
        int n = l1.length;

        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSquare = l1[left] * l1[left];
            int rightSquare = l1[right] * l1[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        System.out.println(Arrays.toString(result));
    }
}
