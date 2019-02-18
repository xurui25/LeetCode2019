package solution1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    class Node {
        public int num;
        public int index;

        public Node(int num, int index) {
            this.index = index;
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    public int[] twoSum1(int[] nums, int target) {
        Node[] nodes = new Node[nums.length];
        for (int k = 0; k < nums.length; k++) {
            nodes[k] = new Node(nums[k], k);
        }
        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.getNum() > o2.getNum()) {
                    return 1;
                } else if (o1.getNum() == o2.getNum()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        int i = 0;
        int j = nums.length - 1;
        while(i != j) {
            if (nodes[i].getNum() + nodes[j].getNum() == target) {
                return new int[]{nodes[i].getIndex(), nodes[j].getIndex()};
            } else if (nodes[i].getNum() + nodes[j].getNum() < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 12};
        System.out.print(solution.twoSum1(nums, 9)[0] + solution.twoSum(nums, 9)[1]);
    }
}
