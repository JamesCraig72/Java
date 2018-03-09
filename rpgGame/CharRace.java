
/**
 * Write a description of class CharRace here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class CharRace
{
   
   Random raceGen = new Random();  // New random number generator
   String charRace;
   


public CharRace()
{}



public void setRace()
{
       int raceMarker;

       
       
       raceMarker =(raceGen.nextInt(9));
       
       switch(raceMarker){
           case 0:
              //  System.out.println("Dragonborn");
              //  dBorn.setAtt();
              //  dBorn.getAtt();
                charRace = "Dragonborn";
                break;           
           case 1:
              //  System.out.println("Dwarf");
              //  dwarf.setAtt();
              //  dwarf.getAtt();
                charRace = "Dwarf";
                break;           
           case 2:
              //  System.out.println("Eladrin");
              //  eladrin.setAtt();
              //  eladrin.getAtt();
                charRace = "Eladrin";
                break;           
           case 3:
             //   System.out.println("Elf");           
             //   elf.setAtt();
             //   elf.getAtt();
                charRace = "Elf";
                break;           
           case 4:
             //   System.out.println("Halfling");           
             //   halfling.setAtt();
             //   halfling.getAtt();
                charRace = "Halfling";
                break;           
           case 5:
             //   System.out.println("Half-elf");           
              //  halfelf.setAtt();
             //   halfelf.getAtt();
                charRace = "Half-elf";
                break;           
           case 6:
             //   System.out.println("Human");           
             //   human.setAtt();
             //   human.getAtt();
                charRace = "Human";
                break;           
           case 7:
             //   System.out.println("Tiefling");           
             //   tiefling.setAtt();
             //   tiefling.getAtt();
                charRace = "Tiefling";
                break;           
           case 8:
             //   System.out.println("Gnome");           
             //   gnome.setAtt();
              //  gnome.getAtt();
                charRace = "Gnome";
                break;
           
       
        }

        

        
        
}


       

public String getRace()
{
           
return charRace;
}

}


