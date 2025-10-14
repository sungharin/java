package sec04.exam01;

public class main {

	public static void main(String[] args) {
		int gasTank = 100;
		int minGas = 20;
		int numofRounds = 20;
		
		car hyundai = new Car(gasTank, minGas,
				"Hyundai", "Yellow");

		int numofRound = 0;
		while(numofRound < numofRounds)
		{
			numofRounds++;
			
			if(hyundai.IsLeftGas()) {
				
				
			}
			else
				hyundai.AddGas(gasTank);
		}
	}
	hyundai.Plus(1,2);
	hyundai.Plus(1.0, 2);
	hyundai.Plus(1,2.0);
	hyundai.Plus(1);
  }

