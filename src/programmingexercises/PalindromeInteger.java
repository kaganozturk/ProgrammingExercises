/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

/**
 *
 * @author kagan
 */
public class PalindromeInteger {

    public static void main(String[] args) {

        System.out.println(isPalindrome(545));
        System.out.println(isPalindrome(45));

    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;

    }

    public static boolean isPalindrome(int number) {

        return number == reverse(number);
    }
}
