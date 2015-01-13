package textRPG;

import java.io.BufferedReader;

public final class Battle {

	public Battle(Player player, Monster monster){
		System.out.println("oh no a battle with "+monster);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (player.isAlive() && monster.isAlive()) {
			
			System.out.println("Attack (a) or heal (h)?")
			String action = in.readLine();
			
			if (action.equals("h")){
			
				if(player.gotPotions()>0){
				player.heal();}
				
				else {
					System.out.println("Sorry you dont have a potion, now attacking");
					}
			}
			else{
				//NEEDS TO ATTACK
			}
		}
	}

}
