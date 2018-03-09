/*Name: James P. Craig
 * Class: CS140-002
 * Spring 2018
 * Assignment: Programming Assignment 1
 * Date: 01/18/2018
 */
import java.awt.*;

import java.awt.geom.*;

public class Rectangles
{
     int width  = 60;
     int height  = 60;
     int xPosition = 310;
     int yPosition = 120;
     String color  = "red"; 
     boolean isVisible = false;

    
public  Rectangles()
    {
      // uses the fields and values from above
    }



public  Rectangles (int width, int height, int xPosition, int yPosition, String color)
    {
      //assigns formal parameters (in parens) to the field names
        this.width     = width;
        this.height    = height;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color     = color;
        this.isVisible = isVisible;
        
        
    }

//------------------------
private void draw()
   {
       if(isVisible)
    {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, color, new Rectangle(xPosition,yPosition, width, height));
                    
        canvas.wait(10);
        
    }
   }
//------------------------
 private void erase()
   {
       if(isVisible)
       {
           Canvas canvas = Canvas.getCanvas();
           canvas.erase(this);
        }
    }   
    
 public void makeVisible()
 {
    isVisible = true;
    draw();
    }

 public void makeInvisible()
 {
    isVisible = false;
    erase();
    }

 public boolean isVisible()
 {
     return isVisible;
    }

//-----Sets
public void setColor(String color)
    {
        erase();
        this.color = color;
        draw();
    }

public void setXPosition(int value)
    {
        this.xPosition = value;
        draw();
    }

public void setYPosition(int value)
    {
        this.yPosition = value;
        draw();
    }

public void changeWidth(int value)
    {
        this.width = value;
        draw();
    }
    
public void changeHeight(int value)
    {
        this.height = value;
        draw();
    }    

//-----Gets
public String getColor()
    { 
     return this.color;
    }

public int getXPosition()
{   
    return xPosition;
}

public int getYPosition()
{
    return yPosition;
}

public int getWidth()
{
    return width;
}

public int getHeight()
{
    return width;
}

public void moveTo(int x, int y)
{
    
    this.xPosition = x;
    this.yPosition = y;
    draw();
}






}




