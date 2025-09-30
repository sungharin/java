 String company;
   int maxSpeed;
   int speed;
   int rpm;
   
   public car(String company, int maxSpeed) {
      this.company = company;
      this.maxSpeed = maxSpeed;
   }
   
   
   public car(int value) {
   }
   
   void SetMaxSpeed(int value) {
      maxSpeed = value;
   }
   
   void ShowInfo() {
      System.out.println("" + company);
      System.out.println("Company :" + company);
      System.out.println("Max speed : " + maxSpeed);
      System.out.println("Current Speed : " + speed);
      System.out.println("Current RPM : " + rpm);
   }