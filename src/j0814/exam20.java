package j0814;

class Data_1 {
	int value;
	//Data_1() {} 기본생성자 자동 추가 되어져 있음
}

class Data_2 {
	int value;
	
	
	Data_2(){}           //기본생성자
	
	Data_2(int x){       //매개변수가 있는 생성자
		value = x;
	}
}


public class exam20 {

	public static void main(String[] args) {
		// 생성자(constructor)
		// :인스턴스가 생성될 때마다 호출되는 인스턴스 초기화 메서드
		
	   Data_1 d1 = new Data_1();
	   Data_2 d2 = new Data_2(); //=>compile error 없애려면 기본생성자 추가 필수!
	}

}
