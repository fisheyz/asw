package Robots;
import robocode.*;

public class Juggernaut extends Robot{
	public void run(){
		while (true){
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}
	public void onScannedRobot(ScannedRobotEvent e){
		fire(1);
	}
}
/*package man;
import robocode.*;
  
 public class MyFirstRobot extends Robot {
     public void run() {
         while (true) {
             ahead(100);
             turnGunRight(360);
             back(100);
             turnGunRight(360);
         }
     }
  
     public void onScannedRobot(ScannedRobotEvent e) {
         fire(1);
     }
 }*/