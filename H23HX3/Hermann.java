package H23HX3;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Hermann_Goering - a robot by (your name here)
 */
public class Hermann extends Robot
{
	/**
	 * run: Hermann_Goering's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(blue, blue, white, white, white);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			//turnAheadLeft(46);
			//turnAheadLeft(45,10);
			turnGunRight(180);
			back(10);
			turnGunRight(450);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		fire(3);
		(23);
		turnbackright(3,3);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
bearGunTo(ScannedRobort);
fire(3);			
back(10);
		turn(34);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like	
turnbackleft(20,20);
	}	
}
