/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		println("Welcome to the Hailstone Sequence.");
		int n = readInt("Please enter a positive integer: ");
		int count = 0;
		//As long as n is a positive integer, the program will continue
		while(n > 0){
			//When n is even, the program will print, execute n /= 2, and increase the total count by 1
			if(n%2 == 0){
				println(n + " is even, so I take half: " + n/2);
				n /= 2;
				count++;
				//if n ends up being 1 after declaring the new value of n, the program will tell you how many steps it took and then break out of the loop.
				if(n == 1){
				println("The process took " + count + " to reach 1.");	
					break;
				}
			}
			//When n is odd, the program will print, execute n = 3*n+1, and increase the total count by 1
			if(n%2 == 1){
				println(n + " is odd, so I make 3n+1: " + (3*n+1));
				n = 3*n+1;
				count++;
			}
		}
		//In the condition that the user did not enter in a positive integer, the program will respond by telling the user that they did not enter a positive integer.
		if(n <= 0)
			println("Sorry, that is not a positive integer.");
	}
}

