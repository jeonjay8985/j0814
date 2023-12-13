package j0814;

public class exam09 {

	public static void main(String[] args) {
		// 오버라이딩(overriding)
		// 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
        //		ctrl+/ 주석처리됨
		class Point {
			int x;
			int y;
			
			String getLocation() {
				return "x: " +x+ ", y :" +y;
			}
			
		class Point3D extends Point{
			int z;
			
			String getLocation() {
				return "x :" +x+ ",y :" +y+ ",z :"+z;				
			}
		} 
			
		}

	}

}
