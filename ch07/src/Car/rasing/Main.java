package Car.rasing;

public class Main {

    public static void main(String[] args) {
        int totalRound = 30;
        int numOfRound = 0;

        Car car = new Car();
        Tire tire = null;  // 변수 선언 필요!

        while (numOfRound < totalRound) {
            numOfRound++;

            if (numOfRound == 20)
                Env.isRain = true;

            System.out.println("Round: " + numOfRound);

            if (!car.CheckTire()) {
                if (Env.isRain)
                    tire = new WetTire(100, 30);
                 
                else
                    tire = new DryTire(100, 15);

                car.changeTire(tire);
            }

            car.Run();
        }
    }
}
