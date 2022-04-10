package cn.codecooker.q389;

public class solution {
    public char findTheDifference(String s, String t) {
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a'] -= 1;
            if (charCount[t.charAt(i) - 'a'] < 0) {
                return t.charAt(i);
            } 
        }

        // 不可能到
        return '\0';
    }
}