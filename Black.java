package BK;
import robocode.*;
import java.awt.Color;
import java.util.Random;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Black - a robot by Manoel
 */
public class Black extends Robot
{

	/**
	 * run: Black's default behavior
	 */
	public void run() {
		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar
		 setColors(Color.black, Color.black, Color.red);
		 Random random = new Random();
	     
	        while (true) {
	        	double posicao  = (double)Math.random() * 100;
	        	double posicao1 = (double)Math.random() * 100;
	        	double posicao2 = (double)Math.random() * 180;
	        	ahead(posicao);
	        	back(posicao1);
	        	turnRight(posicao2);
	        	turnGunRight(360);
	        
	        }
		
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(5);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		ahead(50);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		double x = getX();
		double y = getY();
		double width = getBattleFieldWidth();
		double height = getBattleFieldHeight();
		
		if ((x == width) || (x == 0)) {
			ahead(30);
		}
		if ((y == height) || (y == 0)) {
			ahead(30);
		}
	}
	
	/**
	 * OnHitRobot: Se Black bater em um inimigo
	 * Recua 
	 */
	public void onHitRobot(HitRobotEvent e) {
		back(60);
	}
		
}
