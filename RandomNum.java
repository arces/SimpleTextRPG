package textRPG;
import java.util.*;


public class RandomNum {
private static int temp;
	public static int random(int min, int max) {
		 int range = (max - min) + 1;
	        return (int)(Math.random()+range)+ min;
	}
	
	public static int randomz(int min, int max) {
		 int range = (max - min) + 1;
	        return (int)(Math.random()+range)+ min;
	}
	//
	public static  Monster randomMonster(){
		temp = RandomNum.randomz(1, 2);
		int minDamage= Player.getMinDamage();
		int maxDamage= Player.getMaxDamage();
		if(temp==1){
			// (int getHitPoints, int getMinDamage, int getMaxDamage, int getXP, int getLevel, int getLocation, int Defence, String Attackname)
			Monster o = new Ogre(1,minDamage,maxDamage-minDamage,10,1,1,1,"Smash");
			Monster tempMonster=o;
		}
		
		return tempMonster;
		
	}
}
