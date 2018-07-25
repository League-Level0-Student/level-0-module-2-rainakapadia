//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Random randomMaker = new Random();

			int randomNumber = randomMaker.nextInt(5);

			System.out.println(randomNumber);

			// 1. Use each value of randomNumber to give the user a random compliment.
			if (randomNumber == 0) {
				System.out.println("you are nice");
			} else if (randomNumber == 1) {
				System.out.println("you are smart");
			} else if (randomNumber == 2) {
				System.out.println("you are pretty");
			} else if (randomNumber == 3) {
				System.out.println("you are sweet");
			} else if (randomNumber == 4) {
				System.out.println("you are cool");
			} else {
				System.out.println("you are amazing");

				// 2. Repeat all the code above 10 times

				// 3. Find someone to test out your program. They will like it :)
			}
		}
	}
}
