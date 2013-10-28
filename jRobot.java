import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class jRobot {
   public static void main(String[] args) {
      try {
         Robot r = new Robot();

         //1920x1080
         r.delay(1000);
         while(true) {
            //r.mouseMove(1000, 301);

            r.mousePress(InputEvent.BUTTON1_MASK);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
            r.delay(1);
         }
      }

      catch (AWTException e) {
         e.printStackTrace();
      }
   }
}

