package winter_recipes;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Tree  {

  // ******   If you want to change the name of the robot, do it now  *********** 
	  
  static Robot rob  = new Robot("https://ct1.medstarhealth.org/content/uploads/sites/3/2018/02/President_Barack_Obama-240x300.png");

  // *** You will need the next two values later in your code, but don't change them here 
  static int turnAmount = 175;
  static int treeWidth = 15;
  static double scale = 1.1;   
	
  public static void main(String[] args) {

	  // 1. Make the robot go fast
rob.setSpeed(999);
	  
	  // 2. Tell the robot to put its pen down
rob.penDown();
	  // 3. Find the method called drawBranches below and complete its code
      drawBranches();
      
	  // 4. Find the method called drawTrunk below and complete its code
      drawTrunk();
      
	  // 5. Find the method called drawStar below and complete its code
      drawStar();

}

   
    static void drawBranches() {
        //  Change the color of the line the robot draws to green    

	

    	rob.setPenColor(16,255,0);
        //  Make an int variable called turnAmount and set it to 175

        //  Set the robot's angle so it faces right
rob.turn(90);
        //  Make a for loop that repeats 11 times and put the rest of the code that draws branches inside the for loop
for (int i = 0; i < 15; i++) {

            // Move the robot the width of the tree (use the treeWidth variable from the top of this program)
    		rob.move(treeWidth);
            // Turn the robot (use the turnAmount variable you made earlier)
    		rob.turn(turnAmount);
            // Scale up the treeWidth (    treeWidth *= scale;   )
    		treeWidth *= scale;
            // Move the robot the width of a tree again
    		 rob.move(treeWidth);
            // Turn the robot by the current turn amount, but this time turn to the LEFT (hint: negative turns go left)
    		rob.turn(-turnAmount);
            // Scale up the treeWidth again (    treeWidth *= scale;   )
    		 treeWidth *= scale;  
            // Decrease turnAmount by 1
 
    	// Make sure your for loop ends here!
}}
    
    static void drawTrunk() {
        //  Move the robot half the width of the tree
    	rob.move(treeWidth/2);

        // Set the robot's angle so that it is pointing straight down
  rob.setAngle(180);

        // Set the pen width to the tree width divided by 10
     rob.setPenWidth(treeWidth);

        // Set the color of the robot's pen to brown
  rob.setPenColor(185,103,0);

        // Move the robot a quarter the tree width
rob.move(treeWidth/4);
    }
    
    static void drawStar() {
        // * Challenge: Write code to draw a red star on top of the tree. Hint: 144 degrees makes a star.
    rob.setY(275);
    rob.setX(460);
    rob.setPenColor(250,0,0);
    rob.setPenWidth(5);
    for (int j = 0; j < 5; j++) {
			
		
    rob.move(25);
    rob.turn(144);
    }
    }


}
