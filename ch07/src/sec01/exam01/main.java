package sec01.exam01;

public class main {
  
	 public static void main(String[] args) {
		 Car car;
		 Truck truck = new Truck(80, 200);
		 
		
		 truck.Showspeed();
		 car = truck;
		 car.Showspeed();
		 
		 System.out.println("car speed is"
				 + car.speed);
		 
		 System.out.println("truck speed is"
				 + truck.speed);
	 }
}
