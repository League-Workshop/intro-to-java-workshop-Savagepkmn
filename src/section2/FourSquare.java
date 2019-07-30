package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
		Robot subBot = new Robot();
	void go() {
		subBot.hide();
		subBot.penDown();
		subBot.setSpeed(300);
		subBot.setPenWidth(5);
for(int i = 0; i<4;i++) {
			subBot.setRandomPenColor();
			subBot.turn(90);
			drawSquare();
}
				
			
	}

	
	void drawSquare() {
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i = 0; i<4; i++){
			subBot.move(50);
			subBot.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



