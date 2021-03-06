package com.ryz2593.leetcode;

/**
 *
 * 69. Sqrt(x)

 Implement int sqrt(int x).

 Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

 Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

 Example 1:

 Input: 4
 Output: 2
 Example 2:

 Input: 8
 Output: 2
 Explanation: The square root of 8 is 2.82842..., and since
 the decimal part is truncated, 2 is returned.
 *
 * @author ryz2593
 * @date 2019/6/4
 * @desc
 */
public class Sqrt_x {

    public static int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(mySqrt(num));
    }
}
