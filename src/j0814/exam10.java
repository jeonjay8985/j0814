package j0814;


class Car {
	
	private String color;
	int speed;
	
	Car() {                                       //생성자 만들기!
		System.out.println("부모 생성자");
	}
	
	final public void upspeed(int value) {        //final붙이면 못고치게 막아버림. 오버라이딩 불가
		speed=speed+value;
		System.out.println("현재속도(부모클래스) : " +speed);
	}
	public void douwnspeed(int value) {
		speed=speed-value;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan extends Car {              //extends: 상속받겠다!, 위에 Car에서 선언된 변수 전부 사용 가능!
	int seatNum;
	
	Sedan() {
		System.out.println("Sedan 생성자");
	}
	
	void upSpeed(int value) {
		super.upspeed(value);
		
		speed=speed+value;             //상위 클래스 정의를
		if(speed>150) {                //하위 클래스에서 재정의함
			speed=150;                 //최고시속을 150으로 막겠다, 고정시키겠다!고 추가로 정의함. 매소드 오버라이딩
		}
		System.out.println("현재속도(서브클래스) : " +speed);
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

}


class Truck extends Car {
	int Capacity;                      //적재량 변수 추가!

	Truck() {
		System.out.println("Truck 생성자");
	}
	
	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
}

public class exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%f\n", Math.PI);             //매스함수로 PI(3.14..) 가져오기
		System.out.println("abs :" +Math.abs(-100));    //Math.abs=절대값, Math.sqrt(100)=루트 
		Sedan se1 = new Sedan();
		se1.setColor("파란색");          //Car를 상속 받았기때문에 Sedan에서 setColor 쓸 수 있음!
		se1.setSpeed(40);
		se1.upSpeed(200);              //최고시속을 150으로 고정했기 때문에 40+200해도 240안나옴
		se1.setSeatNum(5);
		
		System.out.printf("색상은 %s이고 속도는 %dkm이고 좌석수는 %d입니다\n", se1.getColor(), se1.getSpeed(), se1.getSeatNum() );
		
		Truck tr1 = new Truck();
		tr1.setColor("파란색");
		tr1.setSpeed(50);
		tr1.setCapacity(50);
		tr1.upspeed(20);
		
		System.out.printf("색상은 %s이고 적재량은 %d이고 속도는 %dkm입니다\n", tr1.getColor(), tr1.getCapacity(), tr1.getSpeed());
	
	
		

		

	}

}
