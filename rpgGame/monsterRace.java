
/**
 * Write a description of class CharRace here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class monsterRace
{
   
   Random raceGen = new Random();  // New random number generator
   String charRace;
   


public monsterRace()
{}



public void setRace()
{
       int raceMarker;

       
       
       raceMarker =(raceGen.nextInt(9));
       
       switch(raceMarker){
           case 0:
              //  System.out.println("v");
              //  dBorn.setAtt();
              //  dBorn.getAtt();
                charRace = "Goblin";
                break;           
           case 1:
              //  System.out.println("Bugbear");
              //  dwarf.setAtt();
              //  dwarf.getAtt();
                charRace = "Bugbear";
                break;           
           case 2:
              //  System.out.println("Zombie");
              //  eladrin.setAtt();
              //  eladrin.getAtt();
                charRace = "Zombie";
                break;           
           case 3:
             //   System.out.println("Skeleton");           
             //   elf.setAtt();
             //   elf.getAtt();
                charRace = "Skeleton";
                break;           
           case 4:
             //   System.out.println("Hobgoblin");           
             //   halfling.setAtt();
             //   halfling.getAtt();
                charRace = "Hobgoblin";
                break;           
           case 5:
             //   System.out.println("Wererat");           
              //  halfelf.setAtt();
             //   halfelf.getAtt();
                charRace = "Wererat";
                break;           
           case 6:
             //   System.out.println("Kobold");           
             //   human.setAtt();
             //   human.getAtt();
                charRace = "Kobold";
                break;           
           case 7:
             //   System.out.println("Tiefling");           
             //   tiefling.setAtt();
             //   tiefling.getAtt();
                charRace = "Orc";
                break;           
           case 8:
             //   System.out.println("Doppelganger");           
             //   gnome.setAtt();
              //  gnome.getAtt();
                charRace = "Doppelganger";
                break;
           
       
        }

        

        
        
}


       

public String getRace()
{
           
return charRace;
}

}


