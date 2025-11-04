package game.simple;

public class GameMain {

	public static void main(String[] args) {
		Player Player = new Player(100,100);
		Dragon dragon = new Dragon(30,30,50);
         Thief thief = new Thief(30,20,50);
        Mouse mouse = new mouse(30,20,50);
        
        Enemy[] enemy= {dragon, thief, mouse};
		
		
		Random rand = new Random();
		
		while(Player.IsAlive()) {
			int val = rand.nextInt(2);
			if(val == 0) {
			dragon.Attack(Player);
			
			else {
				Thieg.Attak(player);
			}
		}
	}
}
