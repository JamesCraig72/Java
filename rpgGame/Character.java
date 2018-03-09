import java.util.Random;      
public class Character
{
 //attributes   
    private int Strength;
    private int Intel;
    private int Wisdom;
    private int Dex;
    private int Const;
    private int Charisma;
 //defences   
    private int hitPoints;
    private int Armor;
    private int Will;
    private int Fort;
    private int Reflex;
 //other  
    private String pcClass;
    private int Level;
    private String w;
 public Character()
 {
    
       Random raceGen = new Random();  // New random number generator
       Random classGen = new Random();  // New random number generator       
       String species = " ";
       
       CharRace       race = new CharRace();
       CharClass      role = new CharClass(); 
       Weapons        weapon = new Weapons();
       CharAttributes attributes = new CharAttributes();
       
       
       role.setClass(classGen.nextInt(8));
       
       race.setRace();
       attributes.setRace(race.getRace());
       
       weapon.setWeapon();
       
       
       
       
       attributes.setStr();
       attributes.setIntel();
       attributes.setWis();
       attributes.setDex();
       attributes.setCon();
       attributes.setChr();
       attributes.setLevel();
       attributes.setReflex();
       attributes.setWill();
       attributes.setFort();
       
       
       Level    = attributes.getLevel();
       w        = weapon.getWeapon(); 
       this.Strength = attributes.getStr();
       Intel    = attributes.getIntel();
       Wisdom   = attributes.getWis();
       Dex      = attributes.getDex();
       Const    = attributes.getCon();
       Charisma = attributes.getChr();
       Reflex   = attributes.getReflex();
       Will     = attributes.getWill();
       Fort     = attributes.getFort();
       
       System.out.println("A level "+ Level + " " +race.getRace()   + " " + role.getCharClass());
       System.out.println("Armed with "    + w); 
       System.out.println("Strength:     " + Strength);
       System.out.println("Intelligence: " + Intel);
       System.out.println("Wisdom:       " + Wisdom);
       System.out.println("Dexterity:    " + Dex);
       System.out.println("Constitution: " + Const);
       System.out.println("Charisma:     " + Charisma); 
       System.out.println("Reflex:       " + Reflex);
       System.out.println("Will:         " + Will);
       System.out.println("Fortitude:    " + Fort);
       System.out.println("  ");
        
        
        
        
       
       
       
       
       
       /*
       System.out.println("A level "+ attributes.getLevel() + " " +race.getRace()   + " " + role.getCharClass());
       System.out.println("Armed with "    + weapon.getWeapon()); 
       System.out.println("Strength:     " + attributes.getStr());
       System.out.println("Intelligence: " + attributes.getIntel());
       System.out.println("Wisdom:       " + attributes.getWis());
       System.out.println("Dexterity:    " + attributes.getDex());
       System.out.println("Constitution: " + attributes.getCon());
       System.out.println("Charisma:     " + attributes.getChr());
       */
    }
}