import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Circles
{
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    
    public Circles()
    {
        diameter = 40;
        xPosition = 250;
        yPosition = 200;
        color = "blue";
        isVisible = false;
    }
    public Circles(int diameter, int xPosition, int yPosition, String color)
    {
        this.diameter = diameter;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
        isVisible = false;
    }

    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
   public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    public boolean isVisible()
    {
        return isVisible;
    }
    
    public void setColor(String color)
    {
        this.color = color;
        draw();
    }
    public void setXPosition(int value)
    {
        xPosition = value;
        draw();
    }
    public void setYPosition(int value)
    {
        yPosition = value;
        draw();
    }
    public void changeDiameter(int value)
    {
        diameter = value;
        draw();
    }
    
    
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
        xPosition = x;
        yPosition = y;
        draw();
    }

    

    /**
     * Draw the circle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                                                          diameter, diameter));
            canvas.wait(10);
        }
    }

    /**
     * Erase the circle on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
