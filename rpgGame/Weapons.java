
/**
 * Write a description of class Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class Weapons
{
    Random weaponGen = new Random();  // New random number generator
    int minDamage;
    int maxDamage;
    String weaponType;
    
    
public Weapons()
{}


public void setWeapon()
{
    int weaponMarker;
weaponMarker =(weaponGen.nextInt(5));
          switch(weaponMarker){  
           case 0:
             //  System.out.println("Fists");
                minDamage = 2;
                maxDamage = 4;
                weaponType = "Fists";
                break;
           case 1:
             //   System.out.println("Club");
                minDamage = 2;
                maxDamage = 6;
                weaponType = "Club";
                break;
           case 2:
             //   System.out.println("Dagger");
                minDamage = 3;
                maxDamage = 6;
                weaponType ="Dagger";
                break; 
           case 3:
             //   System.out.println("Sword");
                minDamage = 3;
                maxDamage = 8;
                weaponType ="Sword";
                break;   
           case 4:
             //   System.out.println("Axe");
                minDamage = 4;
                maxDamage = 8;
                weaponType = "Axe";
                break;                
                
            }      
}

public String getWeapon()
{
    return weaponType;
}





}