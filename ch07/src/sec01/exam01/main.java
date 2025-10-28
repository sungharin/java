package sec01.exam01;

public class main {
  
	 public static void main(String[] args) {
		 Car car;
		 Truck truck = new Truck(80, 200);
		 
		
		 car = truck;
		 truck.Showspeed();
		 car.Showspeed();
		 
		 System.out.println("car speed is"
				 + car.speed);
		 
		 System.out.println("truck speed is"
				 + truck.speed);
	 }
}
