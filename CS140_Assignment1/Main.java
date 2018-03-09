/*Name: James P. Craig
 * Class: CS140-002
 * Spring 2018
 * Assignment: Programming Assignment 1
 * Date: 01/18/2018
 */
import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        // SEE GIVEN OUTPUT TO KNOW WHAT PROMPTS TO USER SHOULD LOOK LIKE
        // PART A IS TO TEST THE CIRCLES CLASS
        // The following line declares a constant. The word "final"
        // means that the variable can not be changed later in the program
        // 1. UNCOMMENT THE FOLLOWING LINE
           final int WINDOW_MAXWIDTH = 800;
        
        
        // The following line declares a another constant. 
        // 2. UNCOMMENT THE FOLLOWING LINE
           final int WINDOW_MAXHEIGHT = 650;
        
        // 3.Declare a Scanner and attach it to the standard input device
        // (the keyboard)
           Scanner keyb = new Scanner(System.in); 
        
        // 4. Declare a variable: newColor, of type String to be used later 
        // in the code
           String newColor;
        
        // 5. Declare a variable: value, of type int to be used later in 
        // the code
           int value;

        // 6. Write the statement to declare an object of the Circles class
        // The object should be called circ1
           Circles circ1;
        
        // 7. Create an object and assign it to the object you just declared.
        // using the constructor with no arguments. 
           circ1 = new Circles(); 
        
        // 8. Using the object you created, call the method to make it visible
        // For the rest of this code, you should see each statement execute on
        // the screen while you do it.
           circ1.makeVisible();
        // The following statement is given and will change the color of the 
        // circle to black if the makeVisible and setColor methods are
        // correct
        // 9. UNCOMMENT the following 2 lines
           if(circ1.isVisible())
             circ1.setColor("black");
        
        // 10. Ask the user to enter a color and store the color they typed into
        // the variable newColor
           System.out.println("Enter a color to change the circle to: ");
           newColor = keyb.next();

        // 11. Change the color of the circle to be the color they typed in
        // When you run this - valid colors are: red, black, blue, green, 
        // magenta, yellow, white
           circ1.setColor(newColor);
        
        // 12. Write the statement so that the circle is on the leftmost part 
        // of the window.
           circ1.moveTo(0,200);
        
        
        // 13. Ask the user to enter a number between 0 and  WINDOW_MAXWIDTH and store 
        // number they type in into the variable value
        // Note: When displaying the prompt - use the constant that is declared
           System.out.println("Enter a value between 0 and " + WINDOW_MAXWIDTH + ": ");
           value = keyb.nextInt();
           circ1.setXPosition(value);
        // 14. Write the statement to move the circle horizontally to the position they entered
           circ1.moveTo(circ1.getXPosition(),circ1.getYPosition());
        // 15. Ask the user to enter a number between 0 and  WINDOW_MAXHEIGHT and store the
        // number they type in into the variable value
        // Note: When displaying the prompt - use the constant that is declared
           System.out.println("Enter a value between 0 and " + WINDOW_MAXHEIGHT + ": ");
           value = keyb.nextInt(); 
           circ1.setYPosition(value);
        // 16. Write the statement to move the circle vertically to the value they typed 
           circ1.moveTo(circ1.getXPosition(),circ1.getYPosition());
           System.out.println(circ1.getXPosition() + " " + circ1.getYPosition());
        // 17. Ask the user to enter a positive integer and store the
        // number they type in into the variable value
           System.out.println("Enter a positive integer: ");
           value = keyb.nextInt();  
        // 18. Write the statement to change the diameter of the circle to be what they entered 
           circ1.changeDiameter(value);
        
        
        // PART B IS TO TEST THE RECTANGLES CLASS
        // 19. Write the statement to declare an object of the Rectangles class
        // The object should be called rect1
           Rectangles rect1;

        // 20. Create an object and assign it to the object you just declared.
        // using the constructor with no arguments. 
           rect1 = new Rectangles();
           
       

        // 21. Using the object you created, call the method to make it visible
           rect1.makeVisible();
        // The following statement is given and will change the color of the 
        // circle to black if the makeVisible and setColor methods are
        // correct
        // 22. UNCOMMENT the following 2 lines
           if(rect1.isVisible())
            rect1.setColor("black");
        
        // 23. Ask the user to enter a color and store the color they typed into
        // the variable newColor
           System.out.println("Enter a color to change the rectangle to : ");
           newColor = keyb.next(); 
        // 24. Change the color of the rectangle to be the color they typed in
           rect1.setColor(newColor);
        // 25. Write the statement so that the circle is on the leftmost part 
        // of the window.
           rect1. moveTo(0,200);
        // 26. Ask the user to enter a number between 0 and  WINDOW_MAXWIDTH and store 
        // number they type in into the variable value
        // Note: When displaying the prompt - use the constant that is declared
           System.out.println("Enter a value between 0 and " + WINDOW_MAXWIDTH + ": ");
           value = keyb.nextInt(); 
           rect1.setXPosition(value);
        // 27. Write the statement to move the rectangle horizontally to the position they entered
           rect1.moveTo(rect1.getXPosition(), rect1.getYPosition());
        // 28. Ask the user to enter a number between 0 and  WINDOW_MAXHEIGHT and store the
        // number they type in into the variable value
        // Note: When displaying the prompt - use the constant that is declared
           System.out.println("Enter a value between 0 and " + WINDOW_MAXHEIGHT + ": ");
           value = keyb.nextInt();
           rect1.setYPosition(value);
        // 29. Write the statement to move the rectangle vertically to the value they typed 
           rect1.moveTo(rect1.getXPosition(), rect1.getYPosition());  
           
        // 30. Ask the user to enter a positive integer and store the
        // number they type in into the variable value
           System.out.println("Enter a positive integer for the new width: ");
           value = keyb.nextInt();
           
        
        // 31. Write the statement to change the width of the rectangle to be what they entered 
           rect1.changeWidth(value);
        
        // 32. Ask the user to enter a positive integer and store the
        // number they type in into the variable value
           System.out.println("Enter a positive integer for the new height: ");
           value = keyb.nextInt();
        // 33. Write the statement to change the height of the rectangle to be what they entered 
           rect1.changeHeight(value);
        
        // The following lines will test the gets and the constructor 
        // Just make sure your output matches the given instructions
        // It should not change the drawing on the canvas, since nothing
        // is being made visible
        // Notice how I use \t to indent on the output :-)
        // 34. UNCOMMENT THE FOLLOWING 13 lines
        
        Circles circ2 = new Circles(200, 50, 150, "blue");
        Rectangles rect2 = new Rectangles(25,50, 100,450, "magenta");
        
        System.out.println("\n\nCircle 2 Information");
        System.out.println("\tDiameter: " + circ2.getDiameter());
        System.out.println("\tUpper left corner: (" + circ2.getXPosition() + ", " + circ2.getYPosition() + ")");
        System.out.println("\tColor: " + circ2.getColor());
        System.out.println("\tVisible: " + circ2.isVisible());
        
        System.out.println("\n\nRectangle 2 Information");
        System.out.println("\tWidth: " + rect2.getWidth());
        System.out.println("\tHeight: " + rect2.getHeight());
        System.out.println("\tUpper left corner: (" + rect2.getXPosition() + ", " + rect2.getYPosition() + ")");
        System.out.println("\tColor: " + rect2.getColor());
        System.out.println("\tVisible: " + rect2.isVisible());
        
        
    }
}
