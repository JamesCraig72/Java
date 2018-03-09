
/**
 * Write a description of class CharClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CharClass
{
   String charClass;   



public CharClass()
{}

public void setClass(int value)
{
 if (value == 0)
 {charClass = "Cleric";}
 else if (value == 1)
 {charClass = "Fighter";}
 else if (value == 2)
 {charClass = "Paladin";}
 else if (value == 3)
 {charClass = "Ranger";}
 else if (value == 4)
 {charClass = "Rogue";}
  else if (value == 5)
 {charClass = "Warlock";}
  else if (value == 6)
 {charClass = "Warlord";}
  else if (value == 7)
 {charClass = "Wizard";}
    
}

public String getCharClass()
{
           
return charClass;
}

}