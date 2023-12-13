package j0814;

//에러있음

class MyPoint3 extends Object {
	int x;
	int y;
	
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public String toString() {
		return "x: " +x+ ", y: " +y;
	}
}
public class exam17 {

	public static void main(String[] args) {
		// OverrideTest-2
		
		MyPoint3 p = new MyPoint3(3, 5);
//		p.x = 3;
//		p.y = 5;
		System.out.println(p);
		
//		System.out.println(p.toString());
//		System.out.println("p.x=" +p.x);
//		System.out.println("p.y=" +p.y);
		
	}

}
