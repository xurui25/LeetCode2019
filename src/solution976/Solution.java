package solution976;

import java.util.Arrays;

public class Solution {
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int i = A.length - 1;
        int j = A.length - 2;
        int k = A.length - 3;
        while (k >= 0) {
            if (A[i] < A[j] + A[k]) {
                return A[i] + A[j] + A[k];
            } else {
                i--;
                j--;
                k--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{2,1,2}));
        System.out.println(largestPerimeter(new int[]{1,2,1}));
        System.out.println(largestPerimeter(new int[]{3,2,3,4}));
        System.out.println(largestPerimeter(new int[]{3,6,2,3}));
    }
}
