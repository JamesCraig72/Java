import java.util.Random;      
public class Monster
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
 public Monster()
 {
    
       Random raceGen = new Random();  // New random number generator
       Random classGen = new Random();  // New random number generator       
       String species = " ";
       
       monsterRace Mon = new monsterRace();
     //  CharClass      role = new CharClass(); 
       Weapons        weapon = new Weapons();
       monsterAttributes monatt = new monsterAttributes();
       
       
       //role.setClass(classGen.nextInt(8));
       
       Mon.setRace();
      // Mon.setRace(Mon.getRace());
       
       weapon.setWeapon();
       
       
       
       
       monatt.setStr();
       monatt.setIntel();
       monatt.setWis();
       monatt.setDex();
       monatt.setCon();
       monatt.setChr();
       monatt.setLevel();
       monatt.setReflex();
       monatt.setWill();
       monatt.setFort();
       
       
       Level    = monatt.getLevel();
       w        = weapon.getWeapon(); 
       this.Strength = monatt.getStr();
       Intel    = monatt.getIntel();
       Wisdom   = monatt.getWis();
       Dex      = monatt.getDex();
       Const    = monatt.getCon();
       Charisma = monatt.getChr();
       Reflex   = monatt.getReflex();
       Will     = monatt.getWill();
       Fort     = monatt.getFort();
       
       System.out.println("A level "+ Level + " " + Mon.getRace());
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