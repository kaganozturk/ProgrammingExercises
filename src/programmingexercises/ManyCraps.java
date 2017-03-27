/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

import java.util.Random;

/**
 *
 * @author kagan
 */
public class ManyCraps {

    public static void main(String[] args) {
        int count = 0;
        int state;
        for (int i = 0; i < 10000; i++) {

            state = playCrap();
            if (state == 1) {
                count++;

            }

        }
        System.out.println("Win count = " + count);
    }

    public static int playCrap() {

        System.out.println("Start");
        int sum;
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        System.out.println("dice 1 = " + dice1);
        int dice2 = random.nextInt(6) + 1;
        System.out.println("dice 2 = " + dice2);

        sum = dice1 + dice2;
        System.out.println("sum = " + sum);
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You Lose");
            return 0;

        } else if (sum == 7 || sum == 11) {
            System.out.println("You Win");

            return 1;

        } else {

            int sumPrevious = sum;
            while (true) {
                System.out.println("Roll again");

                dice1 = random.nextInt(6) + 1;
                System.out.println("dice 1 = " + dice1);

                dice2 = random.nextInt(6) + 1;
                System.out.println("dice 2 = " + dice2);

                sum = dice1 + dice2;
                System.out.println("sum = " + sum);

                if (sum == sumPrevious) {
                    System.out.println("You Win");

                    return 1;

                } else if (sum == 7) {
                    System.out.println("You Lose");

                    return 0;
                }

            }

        }

    }

}
