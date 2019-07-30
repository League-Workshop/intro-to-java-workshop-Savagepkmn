package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
	Robot subBot = new Robot();
	
		
	subBot.hide();
	subBot.setPenColor(255,0,0);			
	subBot.setSpeed(100);
	subBot.move(200);
	subBot.penDown();
	subBot.sparkle();	
		for(int i = 0; i<4; i++){
		subBot.move(50);
		subBot.turn(90);
	}
	
	
		
	}
}
