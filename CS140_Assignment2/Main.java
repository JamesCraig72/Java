import java.util.Scanner;
/**
 * James Craig
 * Class: CS140-002
 * Spring 2018
 * Assignment 2
 * Date: 02/15/2018
 */


public class Main
{
    // instance variables - replace the example below with your own
   public static Scanner kb = new Scanner(System.in);
   public static int speed = 5; // must be at least 1
   public static final int WINDOW_MAXWIDTH = 800;
   public static final int WINDOW_MAXHEIGHT = 650;


    /**
     * Constructor for objects of class Main
     */
public static void main(String [] args)
{
     Circles ball = new Circles();
     boolean loop_sw = true;
      
      String choice;
     
      while (loop_sw)  {     
  choice = printMenu();
          switch(choice.toUpperCase())
          {
            case "A":
            //case "a":
                changeSize(ball);
                break;
            case "B":
            //case "b":
                 changeColor(ball);
                 break;
            case "C":
           //case "c":
                 changePositionofBall(ball);
                 break;  
            case "D":
            //case "d":
                  moveBallToRightEdgeOfWindow(ball);
                  break;
            case "E":
           // case "e":
                  moveBallToLeftEdgeOfWindow(ball);
                  break;
            case "F":
           // case "f":
                  moveBallToTopOfWindow(ball);
                  break; 
            case "G":
           // case "g":
                  moveBallToBottomOfWindow(ball);
                  break; 
            case "H":
           // case "h":                  
                  moveDiagonalUpAndToTheRight(ball);
                  break;
            case "I":
           // case "i":                  
                  moveDiagonalDownAndToTheRight(ball);
                  break;  
            case "J":
           // case "j":                  
                  moveDiagonalDownAndToTheLeft(ball);
                  break;  
            case "K":
           // case "k":                  
                  moveDiagonalUpAndToTheLeft(ball);
                  break; 
            case "L":
           // case "l":                  
                  moveToCenterMakeSmallGrowChangeColor(ball);
                  break; 
            case "M":
           // case "m":                  
                  moveToCenterMakeLargeShrinkChangeColor(ball);
                  break;                   
            case "N":
           // case "n":
                  changeSpeed(ball); 
                  break;
            case "O":
           // case "o":
            System.out.println("End of Line");
            loop_sw = false;
            break;
            default:
                System.out.println("Invalid Choice. Select again.");

           }
           
        //  printMenu();
           
         } ;
   
}

public static String printMenu()
{String a;
    
    System.out.println("A.  Change Diameter");
    System.out.println("B.  Change Color");
    System.out.println("C.  Change position to (x,y)");
    System.out.println("D.  Move to the right edge");
    System.out.println("E.  Move to the left edge");
    System.out.println("F.  Move to the top");
    System.out.println("G.  Move to the bottom");
    System.out.println("H.  Move diagonal up and to the right");
    System.out.println("I.  Move diagonal down and to the right");
    System.out.println("J.  Move diagonal down and to the left");
    System.out.println("K.  Move diagonal up and to the left");
    System.out.println("L.  Grow ball changing colors");
    System.out.println("M.  Shrink ball changing colors");
    System.out.println("N.  Change Speed");
    System.out.println("O.  Quit");

    System.out.println ("Enter Choice: " );
     a = kb.next();
     return a;
}

//Choice A
public static  void changeSize(Circles ball)
{   
    int b;
    System.out.println("Enter new diameter");
    b = kb.nextInt();
    ball.makeVisible();
    ball.changeDiameter(b);
    
}

//Choice B
public static  void changeColor(Circles ball)
{
    String c;
    System.out.println("Enter new color");
    c = kb.next();
    ball.makeVisible();
    ball.setColor(c);
    
}

//Choice C
public static void changePositionofBall(Circles ball)
{
    int x;
    int y;
    System.out.println("Enter new coordinates");
    x = kb.nextInt();
    y = kb.nextInt();
    ball.makeVisible();
    ball.setXPosition(x);
    ball.setYPosition(y);
}

//Choice D
public static  void moveBallToRightEdgeOfWindow(Circles ball)
{
    int v = speed;
    int x ;
    ball.makeVisible();

   
    for (x = ball.getXPosition();x <= WINDOW_MAXWIDTH-ball.getDiameter(); x = x+v)
    {
     
        ball.setXPosition(x);

    }
        

}

//Choice E
public static  void moveBallToLeftEdgeOfWindow(Circles ball)
{
    int v = speed;
    int x ;
    ball.makeVisible();

   
    for (x = ball.getXPosition(); x >= 0; x = x-v)
    {
     
        ball.setXPosition(x);

    }
    
    
}

//CHOICE F
public static  void moveBallToTopOfWindow(Circles ball)
{
    int v = speed;
    int y ;
    ball.makeVisible();

   
    for (y = ball.getYPosition(); y >= 0; y = y-v)
    {
     
        ball.setYPosition(y);

    }

}

//Choice G
public static  void moveBallToBottomOfWindow(Circles ball)
{
    int v = speed;
    int y ;
    ball.makeVisible();

   
    for (y = ball.getYPosition(); y <= WINDOW_MAXHEIGHT-ball.getDiameter(); y = y+v)
    {
     
        ball.setYPosition(y);
        
  
    }
    

   
    
}

//Choice H
public static  void moveDiagonalUpAndToTheRight(Circles ball)
{
    int v = speed;
    int x = ball.getXPosition();
    int y = ball.getYPosition();
    
    ball.makeVisible();
 while ( y >= 0 && x <= WINDOW_MAXWIDTH - ball.getDiameter())
    {
        ball.makeInvisible();

        ball.setXPosition(x);
        ball.setYPosition(y);
        y = y-v;
        x = x+v;

        ball.makeVisible();
    };
   

    
}

//Choice I
public static  void moveDiagonalDownAndToTheRight(Circles ball)
{
    int v = speed;
    int x = ball.getXPosition();
    int y = ball.getYPosition();
    
    ball.makeVisible();   

while ( y <= 650 - ball.getDiameter() && x <= WINDOW_MAXWIDTH - ball.getDiameter())
    {
        ball.makeInvisible();

        ball.setXPosition(x);
        ball.setYPosition(y);
        y = y+v;
        x = x+v;

        ball.makeVisible();
    };

}

public static  void moveDiagonalDownAndToTheLeft(Circles ball)
{
    int v = speed;
    int x = ball.getXPosition();
    int y = ball.getYPosition();
    
    ball.makeVisible();   

while ( y <= 650 - ball.getDiameter() && x >= 0)
    {
        ball.makeInvisible();

        ball.setXPosition(x);
        ball.setYPosition(y);
        y = y+v;
        x = x-v;

        ball.makeVisible();
    };

}

//Choice K
public static  void moveDiagonalUpAndToTheLeft(Circles ball)
{
    int v = speed;
    int x = ball.getXPosition();
    int y = ball.getYPosition();
    
    ball.makeVisible();   


while ( y >= 0  && x >= 0)
    {
        ball.makeInvisible();

        ball.setXPosition(x);
        ball.setYPosition(y);
        y = y-v;
        x = x-v;

        ball.makeVisible();
    };

}

//Choice L
public static  void moveToCenterMakeSmallGrowChangeColor(Circles ball)
{
    int v = speed;
    int x;
    int y ;
    int d = WINDOW_MAXHEIGHT;
    int growth = 50;
    
    ball.makeInvisible();
    ball.changeDiameter(growth);
    x = WINDOW_MAXWIDTH/2 - ball.getDiameter()/2;
    y = WINDOW_MAXHEIGHT/2 - ball.getDiameter()/2;
    ball.setXPosition(x);
    ball.setYPosition(y);
    //ball.setColor("blue");
    ball.makeVisible(); 
    
    


for(d = ball.getDiameter(); d <= WINDOW_MAXHEIGHT; d=d+v)
    {
       ball.changeDiameter(d);


       if(v % 2 == 0) {
       if(ball.getDiameter() % 25 == 0)
           {ball.setColor("yellow");
            }
           else  if  (ball.getDiameter() % 25 == 1)
                     {ball.setColor("green");
            }
            else if  (ball.getDiameter() % 25 == 2)
                     {ball.setColor("yellow");
            }
             else if (ball.getDiameter() % 25 == 3)
                     {ball.setColor("green");
            }}
            else
                 {if (ball.getDiameter() % 50 == 0)
                     {ball.setColor("yellow");
                       
                      }
                  else 
                   if(ball.getDiameter() % 25 == 0)
                     {ball.setColor("green");
                      
                      }}
        
       x = WINDOW_MAXWIDTH/2 - ball.getDiameter()/2;
       y = WINDOW_MAXHEIGHT/2 - ball.getDiameter()/2;
       ball.setXPosition(x);
       ball.setYPosition(y); 
    };

  
}

//Choice M
public static  void moveToCenterMakeLargeShrinkChangeColor(Circles ball)
{
    int v = speed;
    int x;
    int y ;
    int d = WINDOW_MAXHEIGHT;
    int shrink = 50;
    
    ball.makeInvisible();
    ball.changeDiameter(d);
    x = WINDOW_MAXWIDTH/2 - ball.getDiameter()/2;
    y = WINDOW_MAXHEIGHT/2 - ball.getDiameter()/2;
    ball.setXPosition(x);
    ball.setYPosition(y);
    ball.setColor("blue");
    ball.makeVisible(); 
   
    


for(d = ball.getDiameter(); d >= shrink; d=d-v)
    {
       ball.changeDiameter(d);
       
       if(v % 2 == 0) {
       if(ball.getDiameter() % 25 == 0)
           {ball.setColor("red");
            }
           else  if  (ball.getDiameter() % 25 == 1)
                     {ball.setColor("blue");
            }
            else if  (ball.getDiameter() % 25 == 2)
                     {ball.setColor("red");
            }
             else if (ball.getDiameter() % 25 == 3)
                     {ball.setColor("blue");
            }}
            else
                 {if (ball.getDiameter() % 50 == 0)
                     {ball.setColor("red");
                       System.out.println(ball.getDiameter() +  " red");
                      }
                  else 
                   if(ball.getDiameter() % 25 == 0)
                     {ball.setColor("blue");
                      System.out.println(ball.getDiameter() +  " blue");
                      }}
        
       x = WINDOW_MAXWIDTH/2 - ball.getDiameter()/2;
       y = WINDOW_MAXHEIGHT/2 - ball.getDiameter()/2;
       ball.setXPosition(x);
       ball.setYPosition(y); 
    };
   // System.out.println("X = " + x);
   // System.out.println("Y = " + y);
}

//Choice N
public static int changeSpeed(Circles ball)
{
    int s;
    System.out.println("Enter new speed");
    s = kb.nextInt();
    speed = s;

    return s;
}
}
