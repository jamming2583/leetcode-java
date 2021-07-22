package com.dawn.simple;

import java.util.HashMap;
import java.util.Map;

public class TestByLeetCode13 {

    static Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    //自己写的
    public static int romanToInt(String s) {

        int result = symbolValues.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (symbolValues.get(s.charAt(i - 1)) >= symbolValues.get(s.charAt(i))) {
                result = result + symbolValues.get(s.charAt(i));
            } else {
                result = result + symbolValues.get(s.charAt(i)) - 2 * symbolValues.get(s.charAt(i - 1));
            }
        }

        return result;
    }


    //官方的
//    public static int romanToInt(String s) {
//        int ans = 0;
//        int n = s.length();
//        for (int i = 0; i < n; ++i) {
//            int value = symbolValues.get(s.charAt(i));
//            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
//                ans -= value;
//            } else {
//                ans += value;
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

}




