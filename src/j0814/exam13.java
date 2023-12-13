package j0814;

public class exam13 {

	public static void main(String[] args) {
		// 객체의 생성과 사용 - 클래스(설계도)작성
		
		Tv t; //Tv인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv(); //Tv 인스턴스 생성
		t. channel = 7; //Tv인스턴스의 멤버변수 channel값을 7로 설정
		t. channelDown(); //Tv인스턴스의 메서드 channelDown()을 호출
		System.out.println("현재 채널은 " + t.channel + "입니다");

	}

}

class Tv{
	//Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능(메서드)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
