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
public class PasswordCheck {

	public static void main(String[] args) {
		System.out.println(isValid("aaa03ASASasa"));

	}

	public static boolean isValid(String password) {
		int digits = 0;
		if (password.length() < 8) {
			return false;

		}
		for (int i = 0; i < password.length(); i++) {

			if (password.charAt(i) <= '9' && password.charAt(i) >= '0') {
				digits++;
				continue;
			}
			if (!((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') || (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'))) {
				return false;
			}

		}
		return digits >= 2;

	}

}
