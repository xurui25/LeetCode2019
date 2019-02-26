package solution18;

import java.util.*;

public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        Set<List<Integer>> list = new HashSet<>();
        while (a < nums.length - 3) {
            int currentTarget = nums[a] + nums[b] + nums[c] + nums[d];
            if (currentTarget == target) {
                list.add(new ArrayList<>(Arrays.asList(nums[a],nums[b],nums[c],nums[d])));
            }
            d++;
            if (d == nums.length) {
                c++;
                if (c == nums.length - 1) {
                    b++;
                    if (b == nums.length - 2) {
                        a++;
                        if (a == nums.length - 3) {
                            break;
                        }
                        b = a + 1;
                        c = b + 1;
                        d = c + 1;
                    }
                    c = b + 1;
                    d = c + 1;
                }
                d = c + 1;
            }
        }
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}
