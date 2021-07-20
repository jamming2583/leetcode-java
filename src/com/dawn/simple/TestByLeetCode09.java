package com.dawn.simple;


/**
 * @author ltm
 */
public class TestByLeetCode09 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(654123));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int tmp = 0;
        while(x > tmp){
            tmp = tmp * 10 + x % 10;
            x /= 10;
        }
        System.out.println(tmp);
        System.out.println(x);
        return tmp / 10 == x || tmp == x;
    }

}
