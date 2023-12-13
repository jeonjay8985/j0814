package j0814;
//public class가 있는 경우,
//소스 파일의 이름은 반드시
//public class의 이름과 일치해야 한다.
//public class는 반드시 하나! 둘 이상 존재하면 안된다. 
class Average1{
	private int num1;                                //속성지정
	private int num2;  
	private int num3;  
	
	Average1() {                                     //매개변수가 없는 생성자 만들기
		                                            //호출받은애가 갈데가 없음!
	}
	Average1(int num1, int num2) {                       //매개변수가 있는 생성자 만들기
		this.num1=num1;                                //this가 붙으면 클래스 자기 자신의 이름
		this.num2=num2;
	
	}
	
	Average1(int num1, int num2, int num3) {                //매서드 오버로딩, Member로 이름 다 같지만 (매개변수)형식이 다를 수 있음! 다형성
		this.num1=num1;                                //this가 붙으면 클래스 자기 자신의 이름
		this.num2=num2;
		this.num3=num3;
	}
	
	/*int a(int num1, int num2) {
		int sum1 = num1 + num2;
		int avg1 = sum1/2; 
		return avg1;		
	}
	int b(int num1, int num2, int num3) {
		int sum2 = num1 + num2 + num3;
		int avg2 = sum2/3;                                     
		return avg2;		
	}*/
	
	
	void print1() {
		System.out.printf(" %d, %d의 평균:%d\n ", num1, num2);
	}
	
	void print2() {
		System.out.printf("%d, %d, %d의 평균 %d:", num1, num2, num3);
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	
	
}

public class exam06 {

	public static void main(String[] args) {
		// 실습04
		
		Average1 avg1 = new Average1();
		avg1.setNum1(10);                               //넘겨주는것은 set!
		avg1.setNum2(20);
		avg1.print1();
		
		Average1 avg2 = new Average1();
		avg2.setNum1(10);
		avg2.setNum2(20);
		avg2.setNum3(30);
		avg2.print2();
		
		
	}

		

	

}
