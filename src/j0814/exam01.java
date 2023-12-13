package j0814;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		// 실습01
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("n을 입력하시오: ");
		int n=s1.nextInt();
		
		double sum=1;
		System.out.print("1");
		
		for(int i=2; i<=n; i++) {
			System.out.print( "+(1/" +i+ ")" );
			sum=sum+1/(double)i;
			if (i % 10 == 0) System.out.print("\n");
			
		} System.out.println("수열의 합은 :" +sum);
	} 

}
