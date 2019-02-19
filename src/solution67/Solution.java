package solution67;

public class Solution {
    public String addBinary(String a, String b) {
        int num = 0;
        String str = "";
        int i;
        for (i = 0; i < Math.min(a.length(), b.length()); i++) {
            int temp = Integer.valueOf(a.charAt(a.length() - i - 1)) - 48
                    + Integer.valueOf(b.charAt(b.length() - i - 1)) - 48 + num;
            if (temp == 3) {
//                stringBuilder.append(1);
                str = 1 + str;
                num = 1;
            } else if (temp == 2) {
//                stringBuilder.append(0);
                str = 0 + str;
                num = 1;
            } else if (temp == 1) {
//                stringBuilder.append(1);
                str = 1 + str;
                num = 0;
            } else {
//                stringBuilder.append(0);
                str = 0 + str;
                num = 0;
            }
        }

        if (a.length() > b.length()) {
            while (i < a.length()) {
                int temp = Integer.valueOf(a.charAt(a.length() - i - 1)) - 48 + num;
                if (temp == 2) {
                    str = 0 + str;
                    num = 1;
                } else if (temp == 1) {
                    str = 1 + str;
                    num = 0;
                } else {
                    str = 0 + str;
                    num = 0;
                }
                i++;
            }
        } else {
            while (i < b.length()) {
                int temp = Integer.valueOf(b.charAt(b.length() - i - 1)) - 48 + num;
                if (temp == 2) {
                    str = 0 + str;
                    num = 1;
                } else if (temp == 1) {
                    str = 1 + str;
                    num = 0;
                } else {
                    str = 0 + str;
                    num = 0;
                }
                i++;
            }
        }
        if (num == 1) {
            str = 1 + str;
        }
       return str;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.printf(solution.addBinary("100", "110010"));
    }
}
