package j0814;

class Average {
	int getAverage(int a, int b) {
		return (a+b)/2;
	}
	int getAverage(int a, int b, int c) {
		return (a+b+c)/3;
	}
}

public class exam04 {

	public static void main(String[] args) {
		//실습04
		
		Average myavg = new Average();
		System.out.println("10, 20의 평균 : " +myavg.getAverage(10, 20));
		System.out.println("10, 20, 30의 평균 : " +myavg.getAverage(10, 20, 30));

	}

}
