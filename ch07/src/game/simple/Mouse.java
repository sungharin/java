package game.simple;

import java,until.random;

public class Mouse extends Enemy{

	int power;
	  int reward;
	  int winRatio;
	  
	  Dragon(int power, int reward) {
		  this.power = power;
		  this.reward = reward;
		  this.WinRatio = WinRatio;
	  }
	  
	  void Attack(Player) Player) {
		  Random rand = new Random();
		  int val = rand. nextInt(100);
		  
		  if(val < 50) {
			  System.out.Println("Mouse Win!!")l
			  Damage(Player);
			  
			  else {
			  System.out.Println("Player Win!!")l
				  Damage(Player);
				  
			  }
				  
			  }
			  
			  void Damage(Player PLayer) {
				  Player.food -= food;
				  
			  void Reward(Player PLayer) {
					  Player.food -= Reward;
			  }
	  }  
	  
	}
}
