package H23HX3;
import robocode.*;
import java.awt.Color;

/*Dette er ikke min egen kode; https://gist.github.com/rogerluan/d62a26039d9bcb9395f5d391fb1a17ae*/
public class Riedel01 extends AdvancedRobot {
  int gunDirection = 1;

  public void run() {
    // Mere aesthetic changes
    setBodyColor(Color.black);
    setRadarColor(Color.green);
    setGunColor(Color.black);
    setBulletColor(Color.orange);

    // Turns the gun infinitely, looking for enemies
    while (true) {
      turnGunRight(360);
    }
  }
/*sswergwegwe*/
  public void onScannedRobot(ScannedRobotEvent e) {
    // Turn the robot towards the enemy
    setTurnRight(e.getBearing());
    // Shoots always that it's aiming at the enemy
    setFire(3);
    // And move forward
    setAhead(100);
    // Inverts the gun direction on each turn
    gunDirection = -gunDirection;
    // Turn 360 degrees (clockwise or anti clockwise,)
    setTurnGunRight(360 * gunDirection);
    // Execute all the pending actions
    execute();
  }
}