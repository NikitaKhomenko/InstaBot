import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class Bot {
	
	static Robot robot;
	static int mouseY, mouseX;
	
	
	public Bot() throws AWTException {
       
        robot = new Robot();
        
        
	}
	
	public void startLike(){
		
//       mouseY = MouseInfo.getPointerInfo().getLocation().y;
//       mouseX = MouseInfo.getPointerInfo().getLocation().x;
        
//       System.out.println(mouseY + "  " + mouseX);
		
		while(true) {
			robot.mouseMove(525, 401);  //moving to like picture.
		    robot.mousePress(InputEvent.BUTTON1_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_MASK);
		    robot.mousePress(InputEvent.BUTTON1_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_MASK);
		    robot.delay(500);
		    
			robot.mouseMove(1066, 408);  //moving to next picture.
		    robot.mousePress(InputEvent.BUTTON1_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_MASK);
		    robot.delay(2500);
		}
		
	}
	
}
