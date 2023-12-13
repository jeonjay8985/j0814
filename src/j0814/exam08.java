package j0814;

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
        return a+b;
  }

    long add(long a, long b) {
	    System.out.print("long add(long a, long b) -");
	    return a+b;
}
    int add(int[] a) {
    	System.out.print("int add(int[] a) -");
    	int result = 0;
    	for(int i=0; i<a.length; i++)
    		result += a[i];
    	return result;
    }
}
public class exam08 {

	public static void main(String[] args) {
		// 오버로딩: 기존에 없는 새로운 메서드를 정의하는 것 (new)
		// 오버로딩의 올바른 예 -매개변수는 다르지만 같은 의미의 기능 수행
		// 오버로딩 성립 조건 1. 메서드 이름이 같아야 한다  //add
		//              2. 매개변수의 개수 또는 타입이 달라야 한다
		//              3. 반환타입은 영향 없다
		
		
		MyMath3 mm3 = new MyMath3();
		System.out.println("mm3.add(3,3)결과 : " +mm3.add(3,3));
		System.out.println("mm3.add(3L,3)결과 : " +mm3.add(3L,3));
		System.out.println("mm3.add(3,3L)결과 : " +mm3.add(3,3L));
		System.out.println("mm3.add(3L,3L)결과 : " +mm3.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm3.add(a) 결과 : " +mm3.add(a));
		

		
		
		

	}

}
