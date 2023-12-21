package H23HX3;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Hermann_Goering - a robot by (your name here)
 */
public class Hermann_Goering extends JuniorRobot
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
			turnAheadRight(555,515);
			turnGunRight(180);
			back(102);
			turnGunRight(460);
			ahead(10);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		System.out.println("I might not have killed all the jews, but I will kill you");
		turnGunTo(scannedAngle);
		fire(1);
		back(50);
		turnAheadLeft(50,50);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		turnBackRight(111,447);
		turnAheadLeft(314,123);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		turnBackLeft(21,45);
		ahead(43);
	}	
}
