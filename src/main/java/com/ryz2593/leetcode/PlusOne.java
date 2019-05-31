package com.ryz2593.leetcode;

/**
 *
 * 66. Plus One
 *
 Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

 The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

 You may assume the integer does not contain any leading zero, except the number 0 itself.

 Example 1:

 Input: [1,2,3]
 Output: [1,2,4]
 Explanation: The array represents the integer 123.
 Example 2:

 Input: [4,3,2,1]
 Output: [4,3,2,2]
 Explanation: The array represents the integer 4321.

 * @author ryz2593
 * @date 2019/5/31
 * @desc
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, result.length - 1);
        for (int i : result) {
            System.out.print(i + ", ");
        }
        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {8,9,9};
        System.out.println(plusOne(digits));
    }
}
