package sec02.exam01;

public class carExample {
     public static void main(String [] args) {
    	 //객체 생성
    	 car mycar =new car();
    	      
    	 //필드값 읽기
    	 System.out.println("제작회사: " + mycar.company);
    	 System.out.println("모델명: " + mycar.model);
    	 System.out.println("색깔: " + mycar.color);
    	 System.out.println("최고속도:" + mycar.maxSpeed);
    	 System.out.println("현재속도:" + mycar.Speed);
    	 
    	 mycar.Speed = 60;
    	 System.out.println("수정된 속도:" + mycar.Speed);
     }
}
