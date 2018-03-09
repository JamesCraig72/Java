
/**
 * Write a description of class Character here.
 *
 */

import java.util.Random;


public class monsterAttributes
{
    int Strength;
    int Intelligence;
    int Wisdom;
    int Dexterity;
    int Constitution;
    int Charisma;
    String origin;
     
     int xpLevel;
     int hitPoints;
     int Armor;
     int Will;
     int Fort;
     int Reflex;
    
Random randGen = new Random();  // New random number generator

public void setLevel()
{
    xpLevel = randGen.nextInt(2)+3;
}


public void setRace(String race)
{
  origin = race;  
}
    
    
public void setStr()
{ 
    Strength = randGen.nextInt(16)+3;
    
    
    
     //  if (origin.equals("Dragonborn"))
     //       {Strength = Strength + 2;}
 
    
    
}

public void setIntel()
{ 
    Intelligence = randGen.nextInt(16)+3;
      // if (origin.equals("Eladrin") || origin.equals("Tiefling"))
       //     {Intelligence = Intelligence + 2;}
    
}

public void setWis()
{ 
    Wisdom = randGen.nextInt(16)+3;
    
       // if (origin.equals("Dwarf") || origin.equals("Elf"))
       //     {Wisdom = Wisdom + 2;}
            
}

public void setDex()
{ 
    Dexterity = randGen.nextInt(16)+3;
    
       // if (origin.equals("Eladrin") || origin.equals("Elf")|| origin.equals("Halfling"))
       //     {Dexterity = Dexterity + 2;}
 
}

public void setCon()
{ 
    Constitution = randGen.nextInt(16)+3;
    
         //  if (origin.equals("Half-elf")||origin.equals("Dwarf"))
          //      {Constitution = Constitution + 2;}

        } 


public void setChr()
{ 
    Charisma = randGen.nextInt(16)+3;
    
          //     if (origin.equals("Half-elf")||origin.equals("Dragonborn")||origin.equals("Tiefling")||origin.equals("Halfling"))
          //      {Charisma = Charisma + 2;}
    

}

public void setReflex()
{ int reflex;
    
    Reflex = 10 + (xpLevel/2) + findBonus(Dexterity);


}

public void setWill()
{ int will;
    
    Will = 10 + (xpLevel/2) + findBonus(Wisdom);


}

public void setFort()
{ int fort;
    
    Fort = 10 + (xpLevel/2) + findBonus(Wisdom);


}


public int findBonus(int att)
{int bonus = 0;
    switch(att){
    case 22:
    case 21:
      bonus= 5;
      break;
     case 20:
     case 19:
     bonus= 4;
     break;
     case 18:
     case 17:
     bonus = 3;
     break;
     case 16:
     case 15:
     bonus = 2;
     break;
    case 14:
    case 13:
    bonus =1;
    break;
     case 12:
     case 11:
     bonus = 0;
     break;
     case 10:
     case 9:
        bonus = -1;
        break;
     case 8:
     case 7:
     bonus = -2;
     break;
     case 6:
     case 5:
     bonus = -3;
     default: 
     bonus = -4;}
    
    
return bonus;
}

public int getLevel()
{    
    return xpLevel;
}

public int getStr()
{    
    return Strength;
}

public int getIntel()
{    
    return Intelligence;
}

public int getWis()
{    
    return Wisdom;
}

public int getDex()
{    
    return Dexterity;
}

public int getCon()
{    
    return Constitution;
}

public int getChr()
{    
    return Charisma;
}

public int getReflex()
{    
    return Reflex;
}

public int getWill()
{    
    return Will;
}

public int getFort()
{    
    return Fort;
}

}


