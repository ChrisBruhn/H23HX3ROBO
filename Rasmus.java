package H23HX3;
import robocode.*;
import java.lang.Math;
// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html
/**
 * Rasmus - a robot by (your name here)
 */
public class Rasmus extends JuniorRobot
{
	/**
	 * run: Rasmus's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(true) {
		turnRight(5);
			// Replace the next 4 lines with any behavior you would like
		}
	}
	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		if(scannedVelocity == 0) {
			bearGunTo(0);
			fire(3);
			} else {
		// Matematik del - turnGunTo(mig); fire(3);
		double t = 0.6; // int der bruges til at bestemme tiden mht. kollision af fjende og kugle
		int xf = Math.toIntExact(Math.round(robotX + Math.cos(scannedAngle)*scannedDistance)); // x koordinat til fjende
		int yf = Math.toIntExact(Math.round(robotY + Math.sin(scannedAngle)*scannedDistance)); // y koordinat til fjende
		int xc = Math.toIntExact(Math.round(xf + Math.cos(scannedHeading)*scannedVelocity*t)); // x koordinat til kollision med fjende og kugle efter tid t
		int yc = Math.toIntExact(Math.round(yf + Math.sin(scannedHeading)*scannedVelocity*t)); // y koordinat til kollision med fjende og kugle efter tid t
		
		turnTo(Math.toIntExact(Math.round(Math.toDegrees(Math.asin((yc-robotY)/Math.sqrt(((xc-robotX)*(xc-robotX))+((yc-robotY)*(yc-robotY))))))));
		fire(3);
		}
	}	
	
	public void onHitWall() {
		back(15);
		turnRight(100);
	}
	
	public void onHitByBullet() {
		ahead(20);
	}	

}

