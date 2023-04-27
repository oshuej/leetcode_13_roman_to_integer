package main.java.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter roman number: ");
        String romanString = br.readLine();
        System.out.println(romanToInt(romanString) + " in arabic");
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        var res = 0;
        var hs = new HashMap<Character, Integer>();

        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && hs.get(chars[i]) < hs.get(chars[i + 1])) {
                res -= hs.get(chars[i]);
            } else {
                res += hs.get(chars[i]);
            }
        }
        return res;
    }
}
