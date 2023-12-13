package j0814;

class MyPoint3 {
	int x;
	int y;
	
	String getLocation() {
		return "x: " +x+ ", y: " +y;
	}
 }

class MyPoint3D extends MyPoint3 {
	int z;
	
	String getLocation() {
		return "x: " +x+ ", y: " +y+ " ,z: " +z;
	}
}

public class exam16 {

	public static void main(String[] args) {
		// OverrideTest-1
		// 오버라이딩: 상속받은 메서드의 내용 변경(change, modify)
		// 오버라이딩의 조건
		// 1.선언부가 조상 클래스의 메서드와 일치해야 한다
		// 2.접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다
		// 3.예외는 조상 클래스의 메서드보다 많이 선언할 수 없다
		
		MyPoint3D p = new MyPoint3D();
		p.x=3;
		p.y=5;
		p.z=7;
		System.out.println(p.getLocation());

	}

}
