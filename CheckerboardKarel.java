/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	/* Makes Karel place beepers in the checkerboard pattern,
	 * row by row if the world has multiple columns, or
	 * by column if the world is a single column.
	 */
	public void run() {
		turnLeft();
		putBeeper();
		while (frontIsClear()) {
			if(noBeepersPresent()) {
				move();
				putBeeper();
			} else {
				move();
			}
		}
		turnRight();
		move();
		turnRight();
		putBeeper();
		while (frontIsClear()) {
			if(noBeepersPresent()) {
				move();
				putBeeper();
			} else {
				move();
			}
		}
		turnLeft();
		move();
		turnLeft();
		putBeeper();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				move();
				putBeeper();
			} else {
				move();
			}
		}
		turnRight();
		move();
		turnRight();
		putBeeper();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				move();
				putBeeper();
			} else {
				move();
			}
		}
		turnLeft();
		move();
		turnLeft();
		putBeeper();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				move();
				putBeeper();
			} else {
				move();
			}
		}
		turnRight();
		move();
		turnRight();
		putBeeper();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				move();
				putBeeper();
			} else {
				move();
			}
		}
		turnLeft();
		move();
		turnLeft();
		putBeeper();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				move();
				putBeeper();
			} else {
				move();
			}
		}
		turnRight();
		move();
		turnRight();
		putBeeper();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				move();
				putBeeper();
			} else {
				move();
			}
		}
	}
}
