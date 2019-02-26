package solution13;

public class Solution {
    public static int romanToInt(String s) {
        int i = 0;
        int sum = 0;
        while (i < s.length()) {
            if (i != s.length() - 1) {
                if (s.charAt(i) == 'I') {
                    if (s.charAt(i + 1) == 'V') {
                        sum += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }
                    i++;
                    continue;
                } else if (s.charAt(i) == 'X') {
                    if (s.charAt(i + 1) == 'L') {
                        sum += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }
                    i++;
                    continue;
                } else if (s.charAt(i) == 'C') {
                    if (s.charAt(i + 1) == 'D') {
                        sum += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M'){
                        i++;
                        sum += 900;
                    } else {
                        sum += 100;
                    }
                    i++;
                    continue;
                }
            }
            if (s.charAt(i) == 'I') {
                sum += 1;
            } else if (s.charAt(i) == 'V') {
                sum += 5;
            } else if (s.charAt(i) == 'X') {
                sum += 10;
            } else if (s.charAt(i) == 'L') {
                sum += 50;
            } else if (s.charAt(i) == 'C') {
                sum += 100;
            } else if (s.charAt(i) == 'D') {
                sum += 500;
            } else if (s.charAt(i) == 'M') {
                sum += 1000;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
