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
public class SumofDigits {

    public static void main(String[] args) {

        System.out.println(sumDigits(465));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
