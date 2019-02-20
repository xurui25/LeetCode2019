package solution66;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int num = 1;
        int length = digits.length;
        for (int i = 0; i < length; i++) {
            int temp = digits[length - i - 1] + num;
            digits[length - i - 1] = temp % 10;
            num = temp / 10;
        }
        if (num != 0) {
            int[] newDigits = new int[length + 1];
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            newDigits[0] = num;
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{9,9,9};
        solution.plusOne(a);
    }
}
