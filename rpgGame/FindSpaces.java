
import java.util.Scanner;

public class FindSpaces {
   public static void main (String [] args) {
      String passCode;

      passCode = "A ";

      /* Your solution goes here  */
          if(Character.isWhitespace(passCode.charAt(0)))
          {System.out.println("Space at " + passCode.indexOf(passCode.charAt(0)));}
         
         if(Character.isWhitespace(passCode.charAt(1)))
          {System.out.println("Space at " + passCode.lastIndexOf(passCode.charAt(1)));
            } 
        }
    }