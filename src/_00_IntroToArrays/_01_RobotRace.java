package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) { 
		Robot bots[] = new Robot[5];
		int x = 400;
		for(int i = 0; i< bots.length; i++) {
			bots[i] = new Robot();
			bots[i].setY(350);
			bots[i].setX(x);
			x+=100;
			bots[i].setSpeed(15);
		}
		boolean ifWin = false;
		while(ifWin == false) {
			for(int j = 0; j<bots.length; j++) {
				Random number = new Random();
				int movingY = number.nextInt(20);
				bots[j].move(movingY);
				bots[j].turn(-3);
				if(bots[j].getX()<=500 && bots[j].getX()>450 && bots[j].getY()<500 && bots[j].getY()>450) {
					ifWin = true;
					JOptionPane.showMessageDialog(null, "Winner!");
					break;
				}
				else {
					ifWin = false;
				}
			}
		}
	}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
