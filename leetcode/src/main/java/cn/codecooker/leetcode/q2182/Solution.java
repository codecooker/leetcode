package cn.codecooker.leetcode.q2182;

public class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] count = new int[26];

        // first loop, char count
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 25; i >= 0; --i) {
            int appendCount = Math.min(count[i], repeatLimit);
            appendCharWithCount(stringBuilder, (char) ('a' + i), appendCount);
            count[i] -= appendCount;
            if (count[i] > 0) {
                // find the next count > 0
                boolean isFind = false;
                for (int j = i - 1; j >= 0; --j) {
                    if (count[j] > 0) {
                        stringBuilder.append((char) ('a' + j));
                        count[j]--;
                        isFind = true;
                        break;
                    }
                }
                if (!isFind) {
                    count[i] = 0;
                }
                i++;
            }
        }
        return stringBuilder.toString();
    }

    public void appendCharWithCount(StringBuilder stringBuilder, char ch, int count) {
        for (int i = 0; i < count; i++) {
            stringBuilder.append(ch);
        }
    }
}
