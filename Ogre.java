package textRPG;

import java.util.Random;


public class Ogre implements Monster{
	private static int hitPoints;
	private static int minDamage;
	private static int maxDamage;
	private static int XP;
	private static int level;
	private static int location;
	private static int Defence;
	private static String attackName;
	private static final Random random = new Random();
	
	

	public  Ogre(int getHitPoints, int getMinDamage, int getMaxDamage, int getXP, int getLevel, int getLocation, int Defence, String Attackname){
		Ogre.hitPoints = getHitPoints;
		Ogre.minDamage = getMinDamage;
		Ogre.maxDamage = getMaxDamage;
		Ogre.XP = getXP;
		Ogre.level = getLevel;
		Ogre.location = getLocation;
		Ogre.Defence = Defence;
		Ogre.attackName=Attackname;
	}

	public int getAttack(){
		return RandomNum.random(minDamage, maxDamage);
	}
	
	public int getHitPoints()
	{return hitPoints;
		//get the location
		//if location == dungeon, get dungeon level, give monster hit points based on dungeon level
		//if location == wild, hit points = random num
	}

	public int getMinDamage()
	{return minDamage;
		//given based on hit points
	}

	public int getMaxDamage()
	{return maxDamage;
		//equals Min Attack plus 20
	}

	public  int getDefence(){
		return Defence;
		//Unused 12/27/14
	}
	
	public  String getAttackName(){
		return attackName;
	}
	
	public   int getXP()
	{return XP;
		//rewarded based on player level
	}

	public  int getLevel()
	{return level;
		//determined by hit points
	}

	public  int getLocation()
	{return location;
		//equal to players current location
	}

	public  void setHitPoints(int hp){
		hitPoints=hp;
	}
public  boolean isAlive(){
	return hitPoints > 0;
}
}
