

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class FarmingMacro {
	
	public static void mushroom(Robot robot, int durationInMillis, int leftOverDuration) {
		while (true) {
             // Press and hold 'd' key
             robot.keyPress(KeyEvent.VK_D);
             robot.delay(durationInMillis); // Hold 'd' for the specified duration
             robot.delay(durationInMillis - 7000);
             robot.keyRelease(KeyEvent.VK_D);
            

             robot.delay(1);
             
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(3 * 1000); 
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             
             robot.keyPress(KeyEvent.VK_A);
             robot.delay(500);
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(2 * 1000);
            
             
             robot.delay(durationInMillis);
             robot.delay(durationInMillis - 20000);
           
             robot.keyRelease(KeyEvent.VK_A);  
             robot.keyRelease(KeyEvent.VK_W);
             
             
             
             robot.delay(1);
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(3 * 1000); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             robot.keyPress(KeyEvent.VK_D);
             robot.delay(500);
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(2 * 1000);
             robot.keyRelease(KeyEvent.VK_W);
             
             
             
             robot.delay(durationInMillis); // Hold 'd' for the specified duration
             robot.delay(durationInMillis - 7000);
             
             robot.keyRelease(KeyEvent.VK_D);
             
             robot.delay(500);
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(3 * 1000); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(500);
             
             
             robot.keyPress(KeyEvent.VK_A);
             robot.delay(500);
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(2 * 1000);
             
             
             robot.delay(durationInMillis); // Hold 'd' for the specified duration
             robot.delay(durationInMillis - 20000);
             
             robot.keyRelease(KeyEvent.VK_A);  
             robot.keyRelease(KeyEvent.VK_W);
             
             
             robot.delay(1);
             
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(7 * 1000); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_W);     
             
             robot.delay(500);
		 }
	
	}
	
	
	public static void netherWart(Robot robot, int durationInMillis, int leftOverDuration) {
		 while (true) {
             // Press and hold 'd' key
             robot.keyPress(KeyEvent.VK_D);
             robot.delay(durationInMillis); // Hold 'd' for the specified duration
             robot.delay(durationInMillis);
             robot.delay(leftOverDuration);
             robot.keyRelease(KeyEvent.VK_D);
            

             robot.delay(1);
             
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(3 * 1000); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             
             robot.keyPress(KeyEvent.VK_A);
             robot.delay(1 * 1000);
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(1 * 1000);
             robot.keyRelease(KeyEvent.VK_W);
             
             robot.delay(durationInMillis); // Hold 'd' for the specified duration
             robot.delay(durationInMillis);
             robot.delay(leftOverDuration);
             robot.keyRelease(KeyEvent.VK_A);  
             
             
             
             robot.delay(1);
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(3 * 1000); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             robot.keyPress(KeyEvent.VK_D);
             robot.delay(1 * 1000);
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(1 * 1000);
             robot.keyRelease(KeyEvent.VK_W);
             
             
             
             robot.delay(durationInMillis); // Hold 'd' for the specified duration
             robot.delay(durationInMillis);
             robot.delay(leftOverDuration);
             robot.keyRelease(KeyEvent.VK_D);
             
             robot.delay(500);
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(3 * 1000); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(500);
             
             
             robot.keyPress(KeyEvent.VK_A);
             robot.delay(1 * 1000);
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(1 * 1000);
             robot.keyRelease(KeyEvent.VK_W);
             
             robot.delay(durationInMillis); // Hold 'd' for the specified duration
             robot.delay(durationInMillis);
             robot.delay(leftOverDuration);
             robot.keyRelease(KeyEvent.VK_A);  
             
             
             robot.delay(1);
             
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(6 * 1000); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_W);     
             
             robot.delay(500);
		 }
	}
	
	
	public static void sugarCane(Robot robot, int durationInMillis, int leftOverDuration) {
		leftOverDuration = 0;
		//durationInMillis -= 7000;
		
		while (true) {
			 robot.keyPress(KeyEvent.VK_A);
             robot.delay(46 * 1000);
             robot.keyRelease(KeyEvent.VK_A);
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(53 * 1000);
             robot.keyRelease(KeyEvent.VK_S);
             
             robot.keyPress(KeyEvent.VK_A);
             robot.delay(46 * 1000);
             robot.keyRelease(KeyEvent.VK_A);
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(53 * 1000);
             robot.keyRelease(KeyEvent.VK_S);
             
             robot.keyPress(KeyEvent.VK_A);
             robot.delay(46 * 1000);
             robot.keyRelease(KeyEvent.VK_A);
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(53 * 1000);
             robot.keyRelease(KeyEvent.VK_S);
             
             
             robot.keyPress(KeyEvent.VK_D);
             robot.delay(3 * 1000);
             robot.keyRelease(KeyEvent.VK_D);
              
            
           
	}
		
	}
	
	
	public static void cactus(Robot robot, int durationInMillis, int leftOverDuration) {
		 while (true) {
             // Press and hold 'd' key
             
             robot.keyPress(KeyEvent.VK_D); //6 times
             robot.delay(200);
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(200);
             robot.keyRelease(KeyEvent.VK_S);
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_D);
            

             robot.delay(1);
             
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             
             robot.keyPress(KeyEvent.VK_A);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_A);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             robot.keyPress(KeyEvent.VK_D); //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_D);
            

             robot.delay(1);
           
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.keyPress(KeyEvent.VK_A);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_A);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             
             robot.keyPress(KeyEvent.VK_D);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_D);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             robot.keyPress(KeyEvent.VK_A);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_A);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             
             robot.keyPress(KeyEvent.VK_D);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_D);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             
             robot.keyPress(KeyEvent.VK_A);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_A);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             robot.keyPress(KeyEvent.VK_D);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_D);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             
             robot.keyPress(KeyEvent.VK_A);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_A);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             robot.keyPress(KeyEvent.VK_D);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_D);  
             
             robot.keyPress(KeyEvent.VK_S);
             robot.delay(700); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_S);     
             
             robot.delay(1);
             
             
             robot.keyPress(KeyEvent.VK_A);  //6 times
             robot.delay(24 * 1000); // Hold 'd' for the specified duration
             robot.keyRelease(KeyEvent.VK_A);  
             
      
             
             
             robot.delay(1);
             
             robot.keyPress(KeyEvent.VK_W);
             robot.delay(5 * 1000); // Hold 'a' for the specified duration
             robot.keyRelease(KeyEvent.VK_W);     
             
             robot.delay(500);
		 }
	}
	
	public static void melonPumpkin(Robot robot, int durationInMillis, int leftOverDuration) {
		 while (true) {
			 
			//6 a's
			//5 d's
			
            robot.keyPress(KeyEvent.VK_A); 
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_W); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_A);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_D); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_D);
            
            robot.keyPress(KeyEvent.VK_A); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_A);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_D); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_D);
            
            robot.keyPress(KeyEvent.VK_A); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_A);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_D); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_D);
            
            robot.keyPress(KeyEvent.VK_A); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_A);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_D); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_D);
            
            robot.keyPress(KeyEvent.VK_A); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_A);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_D); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_D);
            
            robot.keyPress(KeyEvent.VK_A); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_A);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_D); 
            robot.delay(29 * 1000);
            robot.keyRelease(KeyEvent.VK_D);
            
            
            robot.keyRelease(KeyEvent.VK_W);
            robot.delay(100);
            
            robot.keyPress(KeyEvent.VK_S); 
            robot.delay(2700);
            robot.keyRelease(KeyEvent.VK_S);
            robot.delay(100);
            
		 }
		 
		 
		 
		 
	}
	
	public static void cocoa(Robot robot, int duratoinInMillis, int leftOverDuration) {
		while(true) {
			int secs = 26500;
			
			 robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         //1
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         //2

	         
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         //3
	         
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         //4
	         
	         
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         //5
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         //6
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         //7
	         
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         //8
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         //9
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         //10
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(500);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         //11
	         
	         robot.keyPress(KeyEvent.VK_S); 
			 robot.delay(secs);
	         robot.keyRelease(KeyEvent.VK_S);
	         robot.delay(100);
	         
	         robot.keyPress(KeyEvent.VK_A); 
			 robot.delay(400);
	         robot.keyRelease(KeyEvent.VK_A);
	         
	         robot.keyPress(KeyEvent.VK_W); 
			 robot.delay(secs + 2000);
	         robot.keyRelease(KeyEvent.VK_W);
	         robot.delay(100);
	         
	         
	         //12
	         
	         
	         
	         robot.keyPress(KeyEvent.VK_D); 
			 robot.delay(5000);
	         robot.keyRelease(KeyEvent.VK_D);
			
			
			
			
		}
	}
	
	
	public static void pickupStash(Robot robot, int duratoinInMillis, int leftOverDuration) {
		while(true) {
			robot.keyPress(KeyEvent.VK_T);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_T);
			robot.delay(100);
			
			robot.keyPress(KeyEvent.VK_UP);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_UP);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			robot.delay(2 * 1000);
			
			
			
			
			
			
		}
		
	}
	
    public static void main(String[] args) {
    	
        try {
            Robot robot = new Robot();
            
            int durationInMillis = 60 * 1000; // Adjust the duration in milliseconds as needed
            int leftOverDuration = 0 * 1000;
            robot.delay(3 * 1000);
            
        //  pickupStash(robot,durationInMillis, leftOverDuration);
          
        // mushroom(robot, durationInMillis, leftOverDuration);
            //speed should be 115
           //60 -0.8 or around there
           
           
        netherWart(robot,durationInMillis, leftOverDuration);	
            //speed should be 93
  
           //90. 5.3
            //also potatoes, carrots, wheat
            
            
         // sugarCane(robot,durationInMillis, leftOverDuration);
         
          //new sugar cane
           //speed: 328
            //-130, 0.0
            //sprint ON
            //hold a and s
            //47
          
            
       //   cactus(robot,durationInMillis, leftOverDuration);
            //speed should be 464
            //90 -0.0
            
          
        //   melonPumpkin(robot,durationInMillis, leftOverDuration);
          //speed should be 400 
          // -90, -58.5
          //holding w and d/a
          //walking on soul sand is fine
            
            
            
        //    cocoa(robot,durationInMillis, leftOverDuration);
            //speed should be 400? open to change
            // -0.1, -45.0
            //IMPORTANT: -0.1
            //walking on soul sand is fine
            //in video says depth strider 3, maybe change speed?
            //sprint OFF
            //im trying speed 320
            //~26-27 seconds
            
          
          
            
            
            
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
