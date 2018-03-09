
/*Name: James P. Craig
 * Class: CS140-002
 * Spring 2018
 * Assignment: Programming Assignment 1
 * Date: 01/18/2018
 */
import java.awt.*;

import java.awt.geom.*;

public class Circles
{
     int diameter  = 40;
     int xPosition = 250;
     int yPosition = 200;
     String color  = "blue"; 
     boolean isVisible = false;

    
public Circles()
    {
      // uses the fields and values from above
    }



public  Circles (int diameter, int xPosition,int yPosition, String color )
    {
      //assigns formal parameters (in parens) to the field names
        this.diameter  = diameter;
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
        canvas.draw(this, color, new Ellipse2D.Double(xPosition,yPosition, diameter, diameter));
                    
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

public void changeDiameter(int value)
    {
        this.diameter = value;
        draw();
    }

//-----Gets
public String getColor()
    { 
        return color;
    }

public int getXPosition()
{ 
    return xPosition;
}

public int getYPosition()
{
    return yPosition;
}

public int getDiameter()
{
    return diameter;
}

public void moveTo(int x, int y)
{
    
    this.xPosition = x;
    this.yPosition = y;
    draw();
}






}







