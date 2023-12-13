package j0814;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		// 실습02
		
		Scanner s1 = new Scanner(System.in);
		
		double[] score = {1.0, 2.0, 3.0, 4.0};
		
		double max = score[0];
		double sum = 0;
		
		for(int i=0; i<score.length; i++) {
			if(score[i] >max) {
				max=score[i];
			}
		sum=sum+score[i];
		}
		
		
		System.out.println("합은: " +sum);
		System.out.println("최대값은: " +max);

	}

}
