package H23HX3;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Plankejunior - a robot by (your name here)
 */
public class Plankejunior extends JuniorRobot
{
boolean movingForward;
	/**
	 * run: Plankejunior's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(black, yellow, black, yellow,black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			movingForward = true;
			ahead(100);
			turnGunRight(90);
			back(150);
			turnGunRight(85);
			turnRight(75);
			back(50);
			turnGunLeft(105);
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		System.out.println(gunHeading);
		System.out.println(scannedAngle);
		turnGunTo(scannedAngle);
		fire(5);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		turnRight(95);
		turnGunLeft(105);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(50);
		turnRight(80);
		turnGunLeft(115);
	}	
}
