/*
 * File: CollectNewsPaperKarel.java
 * --------------------------------
 * Collects the newspaper from the house and returns to the initial position.
 */

import stanford.karel.*;

public class CollectNewsPaperKarel extends SuperKarel {
	public void run() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
		turnRight();
		turnRight();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnLeft();
		turnLeft();
	}
}
