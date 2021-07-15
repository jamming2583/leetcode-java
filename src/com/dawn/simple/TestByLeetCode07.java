package com.dawn.simple;

public class TestByLeetCode07 {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    /**
     * 猪脑子写的
     * @param x
     * @return
     */
//    public static int reverse(int x) {
//        if (x == 0){
//            return 0;
//        }
//        int result = 0;
//        String tempStr = Math.abs(x)+"";
//        char[] tempArr = tempStr.toCharArray();
//        for (int i = 0; i < tempArr.length / 2; i++){
//            char a = tempArr[i];
//            tempArr[i] = tempArr[tempArr.length - i -1];
//            tempArr[tempArr.length - i - 1] = a;
//        }
//        tempStr = String.valueOf(tempArr);
//        try{
//            result = Integer.parseInt(tempStr);
//        } catch (NumberFormatException e){
//
//        }
//        return x > 0 ? result : result * -1;
//    }
    /**
     * 别人的~
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

}
