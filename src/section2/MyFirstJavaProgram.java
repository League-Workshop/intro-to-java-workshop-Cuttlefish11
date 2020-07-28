package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot one = new Robot();
	one.setRandomPenColor();
	one.penDown();
	one.setSpeed(300);
	for (int i = 0; i < 315; i++) {
		one.turn(360/359);
		one.move(2);
			
	}
	
	
	
	}
	}
